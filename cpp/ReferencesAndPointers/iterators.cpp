#include <iostream>
#include <vector>
#include <iterator>

int iterators() {
    /*
     * Iterators abstract the concept of a Pointer.
     * Iterators are types that abstract container data as a linear sequence of objects.
     * Iterators allow us to connect a wide range of containers with a wide range of algorithms via a common interface
    */

    std::vector<int> numbers = {1, 2, 3};

    numbers.begin(); // abstractly "points" to the first element
    numbers.end(); // abstractly "points" to ONE PAST the last element, .end() is not invalid itself, but it is illegal to
    // dereference it.

    // Iterate over vector IN ORDER
    for (std::vector<int>::iterator i = numbers.begin(); i != numbers.end(); i++) {
        std::cout << *i << std::endl;
    }

    numbers.rbegin(); // same as .end(), but incrementing this iterator will go back in reverse order
    numbers.rend(); // same as .begin(), but you can't increment this further, you'll need to decrement it

    // Iterate over vector IN REVERSE ORDER
    for (std::vector<int>::reverse_iterator i = numbers.rbegin(); i != numbers.rend(); i++) {
        std::cout << *i << std::endl;
    }

    // Using iterators to modify elements
    for (std::vector<int>::iterator i = numbers.begin(); i != numbers.end(); i++) {
        *i = 99;
        std::cout << *i << std::endl;
    }

    // .cbegin() returns a pointer to a "const" version of the element it is pointing to. That element cannot be modified
    numbers.cbegin(); // same as .begin(), but the element the iterator points to cannot be modified.
    numbers.cend(); // same as .end(), but the element the iterator points to cannot be modified.
    for (std::vector<int>::const_iterator i = numbers.cbegin(); i != numbers.cend(); i++) {
        // *i = 99; // This is not allowed
        std::cout << *i << std::endl;
    }


    return 0;
}