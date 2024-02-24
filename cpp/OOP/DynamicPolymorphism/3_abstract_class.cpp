#include <iostream>
/*
 * Abstract Classes in C++ are similar to those in Java/Kotlin, etc.
 *
 * • If a class has at least one "abstract" (pure virtual in C++) method, the class is an abstract class
 *   and therefore cannot be instantiated/constructed.
 *      • It can however, have constructors and destructors
 *      • These provide semantics for constructing and destructing the abstract class subobject of any
 *        derived classes.
 *  • Pure Virtual (abstract) Methods in C++ are "virtual" functions that don't have a body, and instead
 *    "equal" to 0. For example:
*/
class Animal {
public:
    /*
     * Abstract Classes must have constructors
    */
    Animal(std::string species): species_{species} {};
    virtual ~Animal() {};
    std::string species() {
        return species_;
    }

    // A "Pure Virtual" (abstract) Method. This makes this "Animal" class an Abstract Class.
    // The reason we use " = 0" is to enforce the fact that this abstract method must be over-ridden/implemented
    virtual std::string perform_action() = 0;

private:
    std::string species_;
};