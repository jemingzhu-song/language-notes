#include <vector>
#include <iostream>
/*
 * While we have ignored heap resources (malloc, free, etc.), they are a critical part of many libraries,
 * and we need to understand best practices around usage.
 *
 * What?
 *      • new/delete
 *      • copy & move semantics
 *      • destructors
 *      • lvalues & rvalues
*/

/*
 * C++ has two types of "resources":
 *      1. Stack Resource
 *      2. Heap Resource
*/
int resource_management() {
    /*
     * When you create a normal variable like the following, they are 1. Stack Resources
     * because at the end of the scope (at the end of this "int resource_management() {}" function,
     * they are destructed AUTOMATICALLY since they are "popped off the stack".
    */
    int a = int{2};
    std::vector<std::string> names = {"Michael", "Adam", "Kenny"};
    /*
     * On the other hand, 2. Heap Resources are created whenever you use the "new" keyword (equivalent
     * to the "malloc" keyword in C) to create variables/objects, like the following.
     * Note that when you use the "new" keyword, the variable type must be a "pointer" to that
     * variable type.
     *
     * In order to free memory, you must MANUALLY free the memory by calling the "delete" keyword.
     *
     * Heap Resources outlives the scope it was created in
     *
     * Summary:
     *      • Create Heap Objects using the "new" keyword
     *      • Free Memory used by them using the "delete" keyword
    */
    int *a1 = new int{4};
    std::vector<int> *names1 = new std::vector<int>{"William", "Charles"};
    // Freeing Memory MANUALLY
    delete a1;
    delete names1;

    return 0;
}

/*
 * Revision: Objects
 *
 * An object in C++ is a region of memory associated with a type - unlike other languages (Java),
 * basic type such as "int" and "bool" are also objects. This is why we can create an "int" by writing:
 *      auto a = int{5};
 *
 * Special things we can do with objects:
 *      • Create
 *      • Destroy
 *      • Copy
 *      • Move
*/

/*
 * Long Lifetimes
 *
 * There are 3 ways you can try and make an object/variable in C++ have a lifetime that outlives
 * the scope it was defined in (for example, suppose you want to return an object that was created
 * inside a function):
 *
 *      1. Returning it out of a function via copy (can have limitations)
 *      2. Returning it out of a function via references (bad practice)
 *      3. Returning it out of a function as a heap resource (recommended way)
*/

/*
 * 2. Long Lifetimes with References
 *
 * • We need to be careful when returning references.
 * • The object must always outlive the reference.
 * • This is undefined behaviour - do not return references to variables local to the function that is
 *   returning. For objects created INSIDE a function, we need to create heap memory and return from that.
*/

/*
 * 3. Long Lifetimes with Heap Resources
 *
 * Because objects/variables can be created and stored on the Heap (by using the "new" keyword to create
 * them), which don't get automatically destructed/popped off the stack, we can use it to create
 * objects/variables that outlive the scope they are defined in.
*/

int* newInt() {
    int* another = new int{999};

    std::cout << another << std::endl; // This will print out the address of this "another" variable

    return another;
}

int newInt_main() {
    int* myInt = newInt();

    std::cout << myInt << std::endl; // This will have the same address as the above std::cout

    delete myInt;

    return 0;
}