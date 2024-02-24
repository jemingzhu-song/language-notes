#include <iostream>
/*
 * Variadic Templates
 *
 * https://youtu.be/f_aE6FobILM?t=3447
*/

/*
 * Consider how the std::cout works. We can append multiple elements to the std::cout via "<<"
 * e.g. std::cout << "hello" << " + " << " and welcome" << std::endl;
 *
 * The following is an example of an implementation of std::cout using Variadic Templates
*/
template<typename T>
auto print(const T& msg) -> void {
    std::cout << msg << " ";
}

// typename... B is similar to a "vararg" in Kotlin, it refers to "many" Bs
// The "..." is referred to as the Spread Operator
template<typename A, typename... B>
auto print(A head, B... tail) -> void { // B... tail is like the "rest of the arguments"
    print(head);
    print(tail...);
}

int main_driver_11_variadic_templates() {
    print(1, 2.0f, "Hello everyone", 3, true);
    return 0;
}