#include <iostream>
#include <vector>
/*
 * Sometimes our programs need to deal with unexpected runtime errors and handle them. Exceptions in C++
 * allow us to do this by:
 *
 *      • Exception Object
 *      • Throwing and Catching Exceptions
 *      • Rethrowing
 *      • noexcept
 *
 * Try-Catch Exceptions in C++ are similar in Java/Kotlin try/catch blocks. If a piece of code
 * that might throw an exception is not in a try/catch block, the exception WON'T BE CAUGHT
 *
 *      try {
 *          // code block
 *      } catch (<exception> e) {
 *          e.what()
 *          // do stuff...
 *      } catch (...) {
 *          // the "..." block catches EVERY POSSIBLE OTHER EXCEPTION
 *      }
 *
 * When catching exceptions in a "catch() {}" block, make sure the exception is a "const reference"
 * since you don't typically need to modify an exception.
 * e.g. try {
 *
 *      }
 *      catch(const std::out_of_range& e) {
 *
 *      }
 *
 *
 * <exception>.what() - the .what() function prints out an explanatory message about the exception
 *
 * WHAT
 *      • Exceptions - are for exceptional circumstances that happen during run-time
 *      • Exception Handling:
 *          • Run-time mechanism
 *          • C++ detects a run-time error and raises an appropriate exception
 *          • Another unrelated part of code catches the exception, handles it, and potentially rethrows
 *            it
 * WHY
 *      • Allows us to deal with anomalies, as opposed to our program crashing
*/
int exceptions() {
    std::cout << "Enter -1 to quit" << std::endl;
    std::vector<int> items{51, 288, 85, 32};
    std::cout << "Enter an index: ";
    for (int print_index; std::cin >> print_index;) {
        if (print_index == -1) {
            break;
        }
        // Our own "custom" exception message
        if (print_index == 100) {
            throw std::out_of_range{"Wayyyy out of bounds"};
        }
        try {
            std::cout << items.at(static_cast<size_t>(print_index)) << std::endl;
        } catch (std::out_of_range const& e) {
            std::cout << e.what() << std::endl;
            std::cout << "Index out of bounds" << std::endl;
        } catch (...) {
            std::cout << "Some other exception happened" << std::endl;
        }
        std::cout << "Enter an index: ";
    }
    return 0;
}
/*
 * Exception Objects
 *
 * Any "Exception Type" is derived from std::exception (this is the "mother of all exception types" -
 * all other exceptions inherit this std::exception class)
 *
*/