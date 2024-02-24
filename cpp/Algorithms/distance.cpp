#include <iostream>
#include <vector>
#include <numeric>

/*
 * std::distance requires the #include <numeric> header
 *
*/

int distance() {
    std::vector<int> numbers = {2, 3, 4, 5, 6, 7};

    // Finding the midpoint of the vector
    auto midpoint1 = numbers.begin() + (numbers.size() / 2);
    std::cout << *midpoint1 << std::endl;

    // Using std::distance() to find the midpoint
    auto midpoint2 = numbers.begin() + std::distance(numbers.begin(), numbers.end()) / 2;
    std::cout << *midpoint2 << std::endl;
    return 0;
}
