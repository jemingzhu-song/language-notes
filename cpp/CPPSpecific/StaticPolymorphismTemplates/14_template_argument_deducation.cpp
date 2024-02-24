#include <vector>
#include <iostream>
/*
 * Template Argument Deducation, Implicit Deducation, Explicit Deducation
 *
 * https://youtu.be/f_aE6FobILM?t=5155
 *
 * Template Argument Deducation refers to the process of how the compiler determines the type of the
 * template parameters if none of them are specified. For example, if you create a vector of Ints without
 * first specifying the Vector is of type <Int>, the compiler will automatically figure this out for you:
 *
 * auto a = std::vector{1, 2} // Creating a vector of Ints without specifying the template parameter <int>
 *
 * auto b = std::vector<int>{1, 2} // Creating a vector of Ints by specifying the template parameter <int>
*/

int template_argument_deducation() {
    auto a = std::vector{1, 2}; // Creating a vector of Ints without specifying the template parameter <int>

    auto b = std::vector<int>{1, 2}; // Creating a vector of Ints by specifying the template parameter <int>

    return 0;
}
