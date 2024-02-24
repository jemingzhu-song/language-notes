#include <iostream>
#include <vector>

/*
 *  Member Initialiser List
 *
 *  This is sort of like a "Primary Constructor" in Kotlin. A member initialiser list initialises data
 *  members before entering the constructor body. It is recommended to ALWAYS use this approach. You must
 *  ensure you initialise data members in the declaration order.
 *
 *  Syntax:
 *      <constructorName>(<type1> param1, <type2> param2) : <fieldName>{param1}, <fieldName>{param2} {
 *          // constructor body
 *      }
 *
 *  The reason we do this is explained here: https://youtu.be/n5Mbxgy_OQs?t=4055
 *  In short, it is faster performance-wise to use a Member Initialiser List, because in C++, the way constructors
 *  work is they first check if anything has been defined in the Member Initialiser List, if not, it uses a
 *  default constructor, and finally, it constructs it in the constructor body.
*/
class user {
public:
    user(std::string name, int age) : name_{name}, age_{age} {
    }

    /* Delegating Constructor */
    /*
     * A constructor may call another constructor from the Member Initaliser List. This other constructor
     * is called entirely before the current constructor.
     *
     * Syntax:
     *      <constructorName>(params) : <otherConstructorName>(params) {
     *          // current constructor body
     *      }
    */
    user(std::string name, int age, std::string degree): user(name, age) {
        this->degree = degree;
    }

private:
    std::string name_;
    int age_;
    std::string degree;
};

int constructors() {
    /*
     * In C++, everything is an object, including "int", "std::string" data types. They all have constructors.
     * One reason why we might use a constructor is to avoid uninitialised values.
    */
    int n; // Not initialised (memory contains previous value)

    int n21{}; // Default constructor (memory contains 0)
    int n22 = int{5}; // Another way to write: int n22 = 5;

    return 0;
}


