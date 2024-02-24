#include <iostream>

/*
 * When an exception is caught, by default the catch will be the only part of the code to use/action the
 * exception.
 * What if other catches (lower in the precedence order) want to do something with the thrown exception?
 *
*/

class T {
    std::string message = "I am an exception message!";
};

int rethrow_exceptions() {
    try {
        try {
            try {
                throw T{};
            } catch (const T& e1) {
                std::cout << "Caught" << std::endl;
                throw; // This "rethrows" the exception, so it is caught in one "layer" above
            }
        } catch (const T& e2) {
            // The "rethrown" exception is caught here
            std::cout << "Caught too!" << std::endl;
            throw; // "Rethrow" again
        }
    } catch (...) {
        // The "rethrown" exception in e2 is caught here
        std::cout << "Caught too x 2!" << std::endl;
    }
}
