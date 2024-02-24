#include <iostream>

int function_variables_pass_by_value_or_reference () {
    return 0;
}

void swapByValue(int x, int y) {
    const int tmp = x;
    x = y;
    y = tmp;
}

int mainSwapValue() {
    int i = 1;
    int j = 2;

    std::cout << i << ' ' << j << std::endl; // 1 2
    swapByValue(j, j);
    // No swap will happen because the function parameters in "swapByValue" are passed in
    // by value - the actual function arguments are a "copy" of the actual values. These arguments
    // are just local variables in that function
    std::cout << i << ' ' << j << std::endl; // 1 2
    return 0;
}

void swapByReference(int &x, int &y) {
    const int tmp = x;
    x = y;
    y = tmp;
}

int mainSwapReference() {
    int i = 1;
    int j = 2;

    std::cout << i << ' ' << j << std::endl; // 1 2
    swapByReference(j, j);

    // Swap will happen because the function parameters in "swapByReference" are passed in
    // by reference - the actual function arguments are a reference to the memory location
    // of those variables passed in
    std::cout << i << ' ' << j << std::endl; // 2 1
    return 0;
}