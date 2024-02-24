#include <iostream>
#include <vector>
/*
 * Inheritence in C++
 *
 * • To inherit off classes in C++, we use the ":" (similar to Kotlin), for example:
 *   class Dog : public Animal {}
 * • Visibility can be one of:
 *      • public: generally use this unless you have a good reason not to
 *      • protected
 *      • private
 * • Visibility is the maximum visbility allowed
 *      • If you specify " : private BaseClass", then the maximum visibility is private.
 *          • Any "BaseClass" members that were public or protected are now private
*/

class BaseClass {
public:
    BaseClass() = default;
    BaseClass(int member): int_member_{member} {};
    /*
     * Whenever you have a class that is intended to be inherited from, ALWAYS make your
     * destructor VIRTUAL. NOTE: When you declare a destructor, the move constructor and
     * assignment constructor are no longer synthesised, so you will need to manually "default"
     * them.
    */
    virtual ~BaseClass() {};
    int get_int_member() { return int_member_; };
    std::string get_class_name() {
        return "BaseClass";
    }

private:
    int int_member_;
    std::string string_member_;
};

/*
 * The class "SubClass" inherits "BaseClass".
 * When we create an instance/object of "SubClass", we are essentially creating 4 member variables:
 * int_member_, string_member_ (part of the "BaseClass" members) and vector_member_, ptr_member_ (part of the
 * "Subclass" members). We are also REDEFININING the "get_class_name()" method (as it has been "over-ridden"
 * the parent class's "get_class_name()" method).
 *
*/

class SubClass : public BaseClass {
public:
    SubClass() = default;
    /*
     * Sub-Class constructors must call the Base-Class constructor. If none is called, then
     * the default base class constructor is called.
     * A subclass cannot initialise the fields defined in the base class.
    */
    SubClass(int member, std::unique_ptr<int>&& ptr): BaseClass(member), ptr_member_{std::move(ptr)} {};
    std::string get_class_name() {
        return "Subclass";
    }

private:
    std::vector<int> vector_member_;
    std::unique_ptr<int> ptr_member_;
};

/*
 * The Object Slicing Problem
 * • If you declare a BaseClass variable, how big is it?
 * • How can the compiler allocate space for it on the stack, when it doesn't know how big it could be?
 * • The Solution: since we care about performance, a BaseClass can only store a BaseClass, not a SubClass.
 *      • If we try to fill that value with a SubClass, then it just fills it with the BaseClass subobject,
 *      and drops the SubClass subobject
 *   Therefore, we pass it by reference, and not by value
*/

/*
 * Here, since we are not passing the BaseClass by reference (but rather by Value (i.e. we are copying it), any
 * SubClass of BaseClass will be dropped, and it will only store a BaseClass).
 */
void print_class_name_slicing_problem(BaseClass base) {
    std::cout << base.get_class_name() << std::endl;
}

/*
 * Here, since we are passing BaseClass by reference, any SubClass objects will not be dropped.
*/
void print_class_name_solved(BaseClass& base) {
    std::cout << base.get_class_name() << std::endl;
}

int driver_main_2_inheritance() {
    BaseClass base_class;
    SubClass sub_class;
    print_class_name_slicing_problem(base_class); // BaseClass
    print_class_name_slicing_problem(sub_class); // BaseClass as well

    print_class_name_solved(base_class);
    // This will still print out "BaseClass", because passing by Reference is still not enough for the compiler
    // or runtime to know we want to call the "SubClass"'s get_class_name() function. The solution to this
    // is Virtual Functions
    print_class_name_solved(sub_class);

    return 0;
}

/*
 * Virtual Functions
 *
 * • How does the compiler decide which version of GetClassName to call?
 * • How can it ensure that calling GetMember doesn't have similar overhead
 *      • Explicitly tell the compiler that GetClassName is a function designed to be modified by
 *        subclasses.
 *      • Use the keyword "virtual" in the base class (writing "virtual" doesnt necessarily mean the function
 *        must be overriden, it just indicates it "can" be overriden. Similar to the "open" keyword in Kotlin)
 *      • Use the keyword "override" in the subclass
*/
class BaseClassAgain {
public:
    int get_int_member() { return int_member_; };

    // We use the "virtual" keyword before the function here to indicate to the compiler that this
    // function might be over-ridden by a sub class.
    virtual std::string get_class_name() {
        return "BaseClass";
    }
    // We also need a "virtual" Destructor
    virtual ~BaseClassAgain() {};

private:
    int int_member_;
    std::string string_member_;
};

class SubClassAgain : public BaseClassAgain {
public:
    // We use the "override" keyword to indicate we are overriding a "virtual" function in the
    // 'BaseClass1'/base class.
    std::string get_class_name() override {
        return "Subclass";
    }

private:
    std::vector<int> vector_member_;
    std::unique_ptr<int> ptr_member_;
};

void print_class_name_final(BaseClassAgain& base) {
    std::cout << base.get_class_name() << std::endl;
}

int main_driver_again_2_inheritance() {
    BaseClassAgain base_class;
    SubClassAgain sub_class;
    print_class_name_final(base_class); // BaseClass
    print_class_name_final(sub_class); // SubClass (since we used the "virtual" keyword)
    return 0;
}

/*
 * VTables
 * https://youtu.be/A3f5QPIqM4M?t=3370
 *
 * Visualisation of VTables: https://pabloariasal.github.io/2017/06/10/understanding-virtual-tables/
 *
 * • Each class has a VTable stored in the data segment
 *      • A VTable is an array of function pointers that says which definition each virtual function points
 *        to for that class
 *      • If the VTable for a class is non-empty, then every member of that class has an additional data
 *        member that is a pointer to the VTable.
 *              • This means that whenever there is a "virtual" function in a class (usually the Base Class),
 *                this means that every member of that class will not have an additional data member
 *                which is a pointer to a VTable.
 *      • When a virtual function is called on a reference or pointer type, then the prgoram actually does
 *        the following:
 *          1. Follow the VTable pointer to get to the VTable
 *          2. Increment by an offset, which is a constant for each function
 *          3. Follow the function pointer at VTable [offset] and call the function
 *
 * The purpose of VTables is that if you don't define any functions with a "virtual" method, and hence any
 * sub classes methods won't "override" the parent class, then no VTable will be created. This means there won't
 * be a penalty if you don't use this behaviour
*/

/*
 * "Final" keyword
 *
 * • Specifies to the compiler "this is not virtual for any subclasses"
 * • If the compiler has a variable of type SubClass&, it now no longer needs to look it up in the VTable
 * • This means static binding if you have a SubClass&, but dynamic binding for BaseClass&
*/
class BaseClass2 {
public:
    int get_member() { return member_; }
    virtual std::string get_class_name() {
        return "BaseClass";
    }

private:
    int member_;
};

class SubClass2 : public BaseClass2 {
public:
    // Using the "final" keyword here, meaning you can't declare this function
    // as "virtual" again, so it can't be overriden for subclasses of this "SubClass2" class.
    std::string get_class_name() override final {
        return "SubClass";
    }

private:
    int subclass_data_;
};
