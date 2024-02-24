#include <functional>
#include <iostream>

int add(int n1, int n2) {
    return n1 + n2;
}


int std_function_wrapper() {
    /*
     * std::function is a general-purpose polymorphic function wrapper that allows you to essentially
     * assign a function to a variable. This variable then becomes usable like a regular function.
    */
    std::function<int(int, int)> adder = add; // now "adder" is the same as the "add(int, int)" function

    std::cout << adder(23, 23) << std::endl;

    return 0;
}