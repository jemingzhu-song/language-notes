#include <iostream>

/*
 * Default Arguments and Virtual Functions
 *
 * • Default Arguments are determined at compile time for efficiency's sake
 * • Hence, default arguments need to use the static type of the function
 * • Avoid Default Arguments when Overriding Virtual Functions - it can lead to undefined
 *   behaviour
*/
class Base {
public:
    virtual ~Base() = default;
    virtual void print_num(int i = 1) {
        std::cout << "Base: " << i << std::endl;
    }
};

class Derived : public Base {
public:
    void print_num(int i = 2) override {
        std::cout << "Derived: " << i << std::endl;
    }
};

int main_driver_10_avoid_default_arguments_with_virtual_functions() {
    Derived derived;
    Base *base = &derived;

    derived.print_num(); // Prints out "Derived: 2"
    base->print_num(); // Prints out "Derived: 1"

    return 0;
}