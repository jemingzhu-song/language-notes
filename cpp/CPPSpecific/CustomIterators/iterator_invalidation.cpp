#include <iostream>
#include <vector>
/*
 * Sometimes we need our custom types/classes to be iterable. We must define that functionality
 * ourselves.
*/

int iterator_invalidation() {
    /*
     * Iterator Revision
     *
     * An iterator is basically an "abstract object".
     * Iterator is an abstract notion of a pointer. Iterators are types that abstract container data
     * as a sequence of objects.
     *      • The glue between containers and algorithms
     *          • Designers of algorithms don't care about details of data structures
     *          • Designers of data structures don't have to provide extensive access operations
    */
    std::vector v{1, 2, 3, 4, 5};
    v.begin();
    std::cout << --(*v.begin()) << std::endl; // 0

    /*
     * Iterator Invalidation
     *
     * What happens when we modify the container whilst using an iterator?
     *      • What happens to the iterator
     *      • What happens to references to elements
     * Using an invalid iterator is undefined behaviour. This is because when we modify a container (especially
     * if we are changing the size of it/resizing it), the memory addresses of the elements are likely to change.
    */
    std::vector v1{1, 2, 3, 4, 5};
    for (auto it = v1.begin(); it != v1.end(); it++) {
        if (*it == 2) {
            v1.push_back(99);
            break; // We need this "break;" statement, otherwise we will run into an error.
        }
        std::cout << "Next" << std::endl;
    }
    // If we don't "break" after inserting, our iterator will become invalidated, and this will
    // result in an "infinite loop" or undefined behaviour

}
