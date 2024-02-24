#include <iostream>
#include <memory>
/*
 * Why?
 *      • Managing unnamed/heap memory can be dangerous, as there is always the chance that the
 *      resource is not released/freed properly. We need solutions to help with this.
 *
 * What?
 *      • Smart Pointers
 *      • Unique Pointer, Shared Pointer
 *      • Partial Construction
*/

/*
 * Smart Pointers
 *
 * • Ways of wrapping unnamed (i.e. raw pointer) heap objects in named stack objects so that
 *   the object lifetimes can be managed much easier.
 * • When we refer to "raw pointers", we mean e.g. int * number;
 * • Usually two ways of approaching problems:
 *      • unique_ptr + raw pointers ("observers")
 *      • shared_ptr + weak_ptr/raw pointers
 *
 * Type                     Shared Ownership            Take Ownership
 * std::unique_ptr<T>       No                          Yes
 * raw pointers             No                          No
 * std::shared_ptr<T>       Yes                         Yes
 * std::weak_ptr<T>         No                          No
*/

/*
 * Unique Pointer
 *
 * std::unique_ptr<T>
 *      • The unique pointer owns the object (a Heap Resource)
 *      • When the unique pointer (which is a Stack Object) is destructed,
 *      the underlying object (Heap Resource) is also destructed
 * raw pointer (observer)
 *      • unique_ptr may ahve many observers
 *      • This is an appropriate use of raw pointers (or references) in C++
 *      • Once the original pointer is destructed, you must ensure you don't access the raw pointers
 *        (no checks exist)
 *      • These observers do not have ownership of the pointer
*/

int unique_ptr() {
    // A "Raw Pointer"
    auto* my_heap_object = new std::string{"Hi"};
    {
        // Creating a "Unique Pointer" (a Smart Pointer) which will "own" a "Raw Pointer"
        auto up1 = std::unique_ptr<std::string>(my_heap_object);

        /*
         * Unique Pointers essentially "pass through" dereferences to it. This means you can call *up1
         * which will just dereference the "raw pointer" itself instead of dereferencing the unique pointer.
         * This means you can treat a unique pointer as if it's just a "raw pointer".
        */
        std::cout << "What is this: " << *up1 << std::endl;
    }

    /*
     * Since we have exited the scope of the unique pointer, the unique pointer and the underlying
     * heap resource (the "Hi" string) has now also been destructed. This means the "original raw pointer"
     * that the unique pointer took ownership over, is now pointing to an UNDEFINED heap resource.
     * Technically the line below results in undefined behaviour or may seg fault.
    */
    std::cout << "What is the raw pointer now: " << *my_heap_object << std::endl;

    /*
     * std::make_unique() allows you to create a unique_ptr without having to use the "new" keyword.
     *
     * It is the RECOMMENDED APPROACH to creating unique pointers.
    */
    auto up2 = std::make_unique<std::string>("Goodbye");
    std::cout << *up2 << std::endl;

    /*
     * You can "reassign" unique_ptr using the "=" operator. The following will automatically
     * free the Heap resource/object that he unique_ptr was initially pointing to. It is similar to
     * calling .reset()
    */
    int * stuff = new int{22};
    auto up3 = std::unique_ptr<int>(stuff);
    std::cout << "What is this: " << *up3 << std::endl;
    std::cout << "What is the underlying Heap Resource: " << *stuff << std::endl;
    up3 = std::make_unique<int>(99);
    std::cout << "What is this: " << *up3 << std::endl;
    std::cout << "What is the underlying Heap Resource: " << *stuff << std::endl; // Prints out garbage

    return 0;
}

int unique_ptr_examples() {
    auto my_heap_object = new std::string{"Hi"};
    auto up1 = std::unique_ptr<std::string>(my_heap_object);

    /*
     * A unique_ptr does not have a copy constructor, so the line below will fail.
    */
//    auto up2 = up1; // This won't compile.

    /*
     * A unique_ptr has a move constructor. Once a unique_ptr has been moved from, the "original"
     * heap resource it was pointing to initially has been freed.
    */
    auto up3 = std::unique_ptr<std::string>(new std::string{"Goodbye"});
    std::cout << "What is up3 now: " << *up3 << std::endl;
    up3 = std::move(up1);

    // up1 has been moved, so it will be in a valid but undefined state.
    // std::cout << "What is up1 now: " << *up1 << std::endl; // This may result in an error
    std::cout << "What is up3 now: " << *up3 << std::endl;

    /*
     * unique_ptr.get() returns a pointer to the heap resource the unique_ptr is managing. It is
     * essentially dereferencing the unique_ptr itself.
    */
    auto my_heap_object2 = new std::string{"Again, Greetings..."};
    auto up4 = std::unique_ptr<std::string>(my_heap_object2);
    std::cout << up4.get() << std::endl;
    std::cout << my_heap_object2 << std::endl;

    /*
     * .reset() - same as "Move Operator"
     * 1) Given current_ptr, the pointer that was managed by *this, performs the following actions,
     *    in this order:
            1. Saves a copy of the current pointer old_ptr = current_ptr
            2. Overwrites the current pointer with the argument current_ptr = ptr
            3. If the old pointer was non-empty, deletes the previously managed object if(old_ptr)
               get_deleter()(old_ptr).
     */
    auto managed = new int{52};
    auto up6 = std::unique_ptr<int>(managed);
    std::cout << *up6 << std::endl;
    std::cout << *managed << std::endl;
    up6.reset(new int{33});
    std::cout << *up6 << std::endl;
    std::cout << *managed << std::endl; // Will print out garbage

    /*
     * .release() of a unique_ptr means that the unique_ptr will no longer take "ownership" of the
     * original pointer - however it DOES NOT FREE the memory/heap resource. It will just return the
     * "raw pointer" it was managing.
    */
    auto my_heap_object3 = new std::string{"Hello, again :)"};
    auto up5 = std::unique_ptr<std::string>(my_heap_object3);
    std::cout << "What is up5 now: " << *up5 << std::endl;
    std::cout << "What is my_heap_object3: " << *my_heap_object3 << std::endl;
    up5.release();
    std::cout << "What is my_heap_object3: " << *my_heap_object3 << std::endl;

    return 0;
}

/*
 * Shared Pointers
 *
 * • std::shared_ptr<T>
 * • You can have multiple shared pointers "share ownership" of the object - i.e. multiple shared
 *   pointers pointing to the same Heap Resource/object. This is compared to unique pointers, which
 *   can't technically have multiple pointers pointing to the same Heap Resource/object (because if
 *   one unique pointer goes out of scope, it will free the Heap Resource, meaning the other unique
 *   pointers still in scope will be pointing to "nothing" since the object was already freed).
 *      • A reference counted pointer
 *      • When a shared pointer is destructed, if it is the only shared pointer left pointing at the
 *        object, then the object is DESTROYED/DESTRUCTED
 *      • Shared Pointers may also have observers
 *              • Just because the pointer has shared ownership doesn't mean the observers should get
 *                ownership too - don't mindlessly copy it.
 * • std::weak_ptr<T>
 * • Weak pointers are used with shared pointers when:
 *      • You don't want to add to the reference count (i.e. the count of how many shared pointers are
 *        pointing to the Heap Resource/object to keep track of which one is the last one so that
 *        when it is destructed, the Heap Resource/object is deleted/freed).
 *      • You want to be able to check if the underlying data is still valid before using it.
 */
int shared_ptr() {
    int * num = new int{9991};
    auto x = std::shared_ptr<int>(num);

    /*
     * Shared Pointers also have a "make_shared" constructor that doesn't require a "new" keyword
     */
    auto x_again = std::make_shared<int>(2);

    /*
     * Shared Pointers do have a "Copy Constructor"
    */
    auto y = x;

    /*
     * .use_count() gets the number of shared pointers currently pointing at the Heap Resource/object
     * the current shared pointer is pointing to.
    */
    std::cout << x.use_count() << std::endl; // 2

    /*
     * Similar to unique_ptr, dereferencing a Shared Pointer is also a "pass through" that is equivalent
     * to dereferencing the actual resource that the Shared Pointer is pointing to.
    */
    std::cout << *x << std::endl;

    /*
     * .get() Similar to unique_ptr, returns a pointer to the heap resource the unique_ptr is managing.
     * It is essentially dereferencing the unique_ptr itself.
     */
    std::cout << x.get() << std::endl;
    std::cout << num << std::endl;


    return 0;
}

int weak_ptr_with_shared_ptr() {
    int * num = new int{9991};
    auto x = std::shared_ptr<int>(num);

    /*
    * Weak Pointers with Shared Pointers - doesn't affect the reference count
    */
    std::cout << x.use_count() << std::endl;
    auto x_weak1 = std::weak_ptr<int>(x);
    auto x_weak2 = std::weak_ptr<int>(x);
    auto x_weak3 = std::weak_ptr<int>(x);
    std::cout << x.use_count() << std::endl;

    /*
     * You can make shared pointers from weak pointers (that point to a resource currently pointed to
     * by a shared pointer). These shared pointers will add to the reference count.
    */
    auto y = std::shared_ptr<int>(x_weak1);
    std::cout << x.use_count() << std::endl;

    return 0;
}

/*
 * ---------- Unique Pointer vs Shared Pointer ----------
 *
 * • You almost always want to use a UNIQUE POINTER instead of a SHARED POINTER as shared pointers
 *   can become extremely complicated.
 * • However, use a Shared Pointer when:
 *      • An object has multiple owners, and you don't know which one will stay around the longest
 *      • You need temporary ownership (outside scope of this course)
 *      • This is very rare
*/

/*
 * Smart Pointer Example Usages
 * • Linked List
 * • Doubly Linked List
 * • Tree
 * • DAG (mutable and non-mutable)
 * • Graph (mutable and non-mutable)
*/

/*
 * Stack Unwinding
 *
 * Stack Unwinding is the process of exiting the stack frames until we find an exception handler for the
 * function.
 * This calls any destructors on the way out.
 *      • Any resources not managed by destructors won't get freed up
 *      • If an exception is thrown during stack unwinding, std::terminate is called
*/
void g() {
    throw std::runtime_error{"Error"};
}

int not_safe1() {
    auto ptr = new int{5};
    g();

    return 0;
}

int not_safe2() {
    auto ptr = new int{5};
    g();
    auto uni = std::unique_ptr<int>(ptr);

    return 0;
}

int safe() {
    auto ptr = std::make_unique<int>(5);
    g();

    return 0;
}

/*
 * Exceptions and Destructors
 *
 * • During stack unwinding, std::terminate() will be called if an exception leaves a destructor
 * • The resources may not be released properly if an exception leaves a destructor
 * • All exceptions that occur inside a destructor should be handled inside the destructor
 * • Destructors don't usually throw exceptions, and need to explicitly opt in to throwing
*/

/*
 * Partial Construction
 * • What happens if an exception is thrown halfway throw a constructor?
 *      • This is C++ standard: "An object that is partially constructed or partially destroyed will
 *        have destructors exectued for all of its fully constructed subobjects"
 *      • A destructor is not called for an object that was partially constructed
 *      • Exception for an exception thrown in a constructor that delegates (Why?)
 *
 * This means a partially constructed object DOES NOT CALL ITS DESTRUCTOR - but it will call the
 * destructor for each of it's fully constructed "subobjects"/members.
 *
 * https://youtu.be/W7t2Pu8FZx4?t=4864
 */
class my_int {
public:
    my_int(int const i) : i_{i} {
        if (i == 2) {
            throw std::exception();
        }
    }
private:
    int i_;
};

class unsafe_class {
public:
    unsafe_class(int a, int b)
    : a_{new my_int(a)}
    , b_{new my_int(b)} {};

    ~unsafe_class() {
        delete a_;
        delete b_;
    }

private:
    my_int* a_;
    my_int* b_;
};

/*
 * In the example above, when we try to construct the "unsafe_class" object "a" below, an
 * exception will be thrown as we attempt to construct member "a_". Since an exception has been
 * thrown during construction, the destructor of "unsafe_class" WILL NOT BE CALLED, and because
 * "a_" has been "fully constructed" and is a Heap Resource, the memory will not be freed because
 * the only place Heap Memory is freed is in the "unsafe_class" destructor (which is not called).
 *
 * Here, to avoid this error, we can use Smart Pointers
*/
int driver_main_function() {
    auto a = unsafe_class(1, 2);
}

/*
 * Solution
*/
class safe_class {
public:
    safe_class(int a, int b)
            : a_{std::make_unique<my_int>(a)}       // Use unique_ptr construction
            , b_{std::make_unique<my_int>(b)} {};   // Use unique_ptr construction

    // No Destructor Needed to free this Heap Memory!
    ~safe_class() {
//        delete a_;
//        delete b_;
    }

private:
    std::unique_ptr<my_int> a_; // Make this a std::unique_ptr type
    std::unique_ptr<my_int> b_; // Make this a std::unique_ptr type
};