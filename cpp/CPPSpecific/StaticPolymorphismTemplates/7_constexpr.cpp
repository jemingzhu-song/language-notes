#include <iostream>
/*
 * Constexpr
 *
 * • Constexpr is a keyword you use to indicate either of the following:
 *      • A variable that can be calculated at compile time
 *      • A function that, if its inputs are known at compile time, can be run at compile time
 * • This will make compile-time longer compared to runtime. However, it can mean runtime is faster.
*/
constexpr int factorial(int n) {
    return n<= 1 ? 1 : n * factorial(n- 1);
}

int main_driver_7_constexpr() {
    // You can use constexpr here
    constexpr int a = 2;
    constexpr int b = 5;
    // Because "a" and "b" are constexpr, the result is also a constexpr
    constexpr int result = a + b;

    /*
     * We can also make this "factorial()" function "constexpr" because the variable "9" is known
     * at compile time.
    */
    int ninefactorial = factorial(9);
    std::cout << ninefactorial << std::endl;

    return 0;
}