#include <iostream>

int variables() {

    /* ========== Basic Data Types ========== */
    int i = 2;
    double d = 9.99;
    float f = 3.56F;
    long l = 888L;
    char c = 'A';
    std::string s = "Welcome Everyone"; // "string" is part of the "std" library
    bool b = true;

    /* ========== 'Special' Data Types ========== */
    // 'auto' variable type automatically determines the type depending on the value you initialise it with
    auto a = 53.23F;

    // 'const' makes the variable immutable
    const int const_i = 23;

    // 'constexpr' the value must be known or calculable at compile-time
    int arr1[] = {0, 2, 4};
    // constexpr int constexpr_i = arr1[1]; // This will be an error since value isn't
    // known in compile-time
    constexpr int constexpr_i = 100; // This is fine since value is known at compile time

    return 0;
}
