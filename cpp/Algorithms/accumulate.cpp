#include <iostream>
#include <vector>
#include <numeric>

/*
 * std::accumulate requires the #include <numeric> header
*/

int accumulate() {
    std::vector<int> numbers = {2, 3, 4, 5, 6, 7};

    // Use accumualte to sum
    int sum = std::accumulate(numbers.begin(), numbers.end(), 0);
    std::cout << sum << std::endl;
    return 0;
}