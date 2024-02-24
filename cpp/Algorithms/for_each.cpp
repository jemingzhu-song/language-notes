#include <iostream>
#include <algorithm>
#include <vector>

void squareNumber(int& n) {
    n = n * n;
}

int for_each() {
    /*
     * for_each (InputIterator start_iter, InputIterator last_iter, Function fnc)
     *      start_iter : The beginning position from where function operations has to be executed.
     *      last_iter : The ending position till where function has to be executed.
     *      fnc/obj_fnc : The 3rd argument is a function or an object function which operation would be
     *      applied to each element.
     *
     */

    std::vector<int> numbers = {1, 2, 3, 4, 5};

    std::for_each(numbers.begin(), numbers.end(), squareNumber);

    for (int i = 0; i < numbers.size(); i++) {
        std::cout << numbers[i] << std::endl;
    }

    // Printing out using for_each
    std::for_each(numbers.begin(), numbers.end(), [] (int& val) { std::cout << val << std::endl; });

    return 0;
}
