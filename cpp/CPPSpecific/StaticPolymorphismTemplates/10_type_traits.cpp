#include <iostream>
#include <limits>
#include <float.h>
/*
 * Type Traits
 *
 * https://youtu.be/f_aE6FobILM?t=2636
 *
 * Trait: Class or Class Template that characterises a type
*/

template <typename T>
struct numeric_limits {
    static auto min() -> T;
};

/*
 * Here, we are creating 2 Explicit Specialisations of the "numeric_limits" type
 */
template<>
struct numeric_limits<int> {
    static auto min() -> int { return -INT_MAX - 1; }
};

template<>
struct numeric_limits<float> {
    static auto min() -> float { return -FLT_MAX - 1; }
};

/*
 * Traits allow generic template functions to be parameterised.
 *
 * In the example below, we can use T largest = std::numeric_limits<T>::min(); to "generalise" the
 * minimum value for the type T. If T is an "int", then the min() will be "-INT_MAX - 1", and if
 * T is "float", then min() will be "-FLT_MAX - 1".
*/
template<typename T, std::size_t size>
T findMax(const std::array<T, size> &arr) {
    T largest = std::numeric_limits<T>::min();
    for (auto const &i : arr) {
        if (i > largest) {
            largest = i;
        }
    }
    return largest;
}