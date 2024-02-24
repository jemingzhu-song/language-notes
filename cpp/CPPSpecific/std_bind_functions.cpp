#include <functional>
#include <iostream>

int func(int a, int b, int c) {
    return a - b - c;
}

int std_bind_functions() {
    /*
     * In C++, we can "bind" functions using the std::bind, which basically allows you to declare a function
     * that "wraps" another function.
     *
    */
    // std::placeholders::_1 represents the first parameter of this "wrapper" function called "func1".
    // This means our new "wrapper" function "func1" will only take in 1 parameter when you call it, and it will
    // then call the "func" parameter, and pass in the hardcoded parameters: 100 and 1, as well as the
    // std::placeholders::_1 parameter received.
    auto func1 = std::bind(func, 100, std::placeholders::_1, 1);

    std::cout << func1(20) << std::endl; // This will call func(100, 20, 1) = 79

    return 0;
}
