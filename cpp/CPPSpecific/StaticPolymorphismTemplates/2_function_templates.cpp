#include <iostream>
#include <array>
/*
 * Function Overloading
 *
 * Functions with the exact same name and return type, but different number of parameters or
 * different parameter types.
*/
auto min (int a, int b) -> double {
    return a < b ? a : b;
}

auto min (double a, double b) -> double {
    return a < b ? a : b;
}

int main_driver_2_function_templates() {
    std::cout << min(1, 2) << std::endl;

   return 0;
}

/*
 * Function Templates
 *
 * Without generic programming, to create two logically identical functions that behave in a
 * way that is independent to the type, we have to rely on function overloading.
 *
 * Function Template: Prescription (i.e. instruction) for the compiler to generate particular
 * instances of a function, varying by type
 *      • The generation of a templated function for a particular type T only happens when
 *        a call to that function is seen during compile time
 *
 * However, the compiler doesn't actually generate a singular "template" function. It will
 * generate separate functions each time it is called with a different type. e.g. If you call
 * this templated "min" function with a string and an int type, the compiler will actually
 * generate a "min" function equivalent for both the string and the int types. This is because
 * it needs to check whether the operations you perform on the types within the function are
 * valid operations.
*/

/*
 * <typename T> is referred to as the "template parameter list" - you need to write this above every time you use "T"
*/
template<typename T>
/*
 * T is referred to as the "template type parameter"
*/
T min(T a, T b) {
    return a < b ? a : b;
}

int main_driver_again_2_function_templates() {
    std::cout << min(1, 2) << std::endl;
    std::cout << min(0.89, 2.2) << std::endl;
    std::cout << min("apple","pear") << std::endl;
    return 0;
}

/*
 * Type and NonType Parameters
 *
 * https://youtu.be/l1E8GLZwP2E?t=1350
 * • Type Parameter: unknown type with no value (template<typename T>)
 * • Nontype Parameter: known type with unknown value
 *      • e.g. template<typename T, std::size_t size>. The "std::size_t size" is a Nontype
 *        Parameter, it has a known type (std::size_t), with an unknown value ("size").
*/
template<typename T1, std::size_t size>

/*
 * We need to define template<typename T1, std::size_t size> because for a STL::array, we need
 * to specify the size of the array when we create it, e.g. std::array<int, 5>{} will initialise
 * an array with a size of 5. Therefore, we need a "generic" parameter to pass in as well.
 */
T1 findmin(const std::array<T1, size> a) {
    T1 min = a[0];
    for (std::size_t i = 1; i < size; i++) {
        if (a[i] < min) {
            min = a[i];
        }
    }
    return min;
}

int main_driver_again_again_3_2_function_templates() {
    std::array<int, 3> x{3, 2, 1};
    std::array<double, 4> y{3.0, 1.5, 9.0, 0.2};

    std::cout << findmin(x) << std::endl;
    std::cout << findmin(y) << std::endl;
   return 0;
}