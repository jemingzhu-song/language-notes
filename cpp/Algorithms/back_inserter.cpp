#include <iostream>
#include <algorithm>
#include <vector>

/*
 * std::back_inserter returns a pointer to the very last element of the container.
 */

int back_inserter() {
    std::vector<std::string> names = {"Michael", "Adam", "Kenny", "Brian", "William"};

    auto i = std::back_inserter(names);

    for (auto i = names.begin(); i != names.end(); i++) {
        std::cout << *i << std::endl;
    }

    return 0;
}