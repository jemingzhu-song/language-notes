#include <iostream>

int arrays() {

    // Create an Array (Pre-Determined Size)
    int lucky[5];

    // Create an Array (Determined Size)
    int luckyNums[] = {9, 2, 5, 15, 52};

    // 1. Get from Array
    std::cout << luckyNums[2] << std::endl;

    // 2. Edit Array
    luckyNums[0] = 99;

    return 0;
}