#include <iostream>
#include <list>
#include <algorithm>

/*
 * std::lower_bound does a binary search, and returns the first value/a pointer to the first value that is
 * greater than or equal to the argument.
 */

int bound() {
    std::list<int> sortedLinkedList{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    auto it = std::lower_bound(sortedLinkedList.begin(), sortedLinkedList.end(), 5);
    std::cout << *it << std::endl;
}
