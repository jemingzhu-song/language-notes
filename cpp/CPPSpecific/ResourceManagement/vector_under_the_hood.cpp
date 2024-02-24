#include <iostream>

/*
 * std::vector<int> under the hood
 *
 * Let's see how a vector is implemented. It's going to have to manage some form of heap memory, which
 * is handled by the class destructor. The class destructor calls the destructor on each of the member
 * variables. However, since our "data_" member variable is a Heap Resource, we must explicitly
 * "delete" it in the destructor, otherwise the memory isn't actually freed.
*/

class my_vec {
public:
    my_vec(int size) : data_{new int[size]}, size_{size}, capacity_{size} {}
    ~my_vec() {
        delete[] data_; // Explicitly delete the Heap Memory associated with "new int[size]"
    };

    int* data_;
    int size_;
    int capacity_;
};
