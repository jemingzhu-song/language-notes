#include <iostream>
#include <vector>

void add_n(std::vector<int>& v, int n) {
    // The "capture" in the below lambda function, [n] is the "context" of the int n parameter passed into
    // this "add_n" function.
    std::for_each(v.begin(), v.end(), [n] (int& val) {val = val + n; });
}

int lambdas() {
    /*
     * Lambdas allow you to define a function in line, sort of like an anonymous function. Lambdas can also
     * be stored in a variable
     *
     * To define a lambda function we have three brackets: [] () {}
     *      [capture] (parameters) -> return {
     *          // body of function
     *      }
     *
     * The "capture" in the [] brackets is basically "context" that is needed. See above example "add_n" function
     * for an explanation.
    */

    std::vector<int> numbers = {1, 2, 3, 4, 5};
    std::for_each(numbers.begin(), numbers.end(), [] (int& n)-> void { n = n * n; });

    for (auto n = numbers.begin(); n != numbers.end(); n++) {
        std::cout << *n << std::endl;
    }

    // Another Example
    auto v = std::vector<int>{1, 2, 3};
    add_n(v, 3);

    for (int element : v) {
        std::cout << element << std::endl;
    }
}
