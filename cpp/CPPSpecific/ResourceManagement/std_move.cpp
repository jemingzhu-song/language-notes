#include <algorithm>
/*
 * (Read "lvalue_rvalue.cpp" first)
 *
 * std::move
 *
 * A library function that converts an lvalue to an rvalue so that a "move constructor" (similar
 * to a copy constructor) can use it.
 *
 * This says "I don't care about this anymore" - all it does is allow the compiler to use rvalue
 * reference overloads
 *
 *
 * Using std::move(<object>) on an object basically just says: "we are makign this <object> 'moveable'" so
 * that it can be passed into the Move Constructor. It "converts" it (an lvalue) to an rvalue.
 * Without std::move(<object>), the compiler wouldn't know to call the "Move Constructor", and
 * rather it will just call the "Copy Constructor"
 *
 * Note that std::move(<object>) does not actually "move" the object. The object is only moved when you
 * call the Move Constructor or Move Assignment
*/
class my_vec {
public:
    my_vec(int size) : data_{new int[size]}, size_{size}, capacity_{size} {}
    ~my_vec() {
        delete[] data_;
    };
    my_vec(my_vec const& orig): data_{new int[orig.size_]}, size_{orig.size_}, capacity_{orig.capacity_} {
        // Copies the actual data that the orig.data_ pointer was pointing to
        std::copy(orig.data_, orig.data_ + orig.size_, data_);
    }

    // Move Constructor - the "&&" refers to a "moveable object"
    my_vec(my_vec&& orig) {

    }

    int* data_;
    int size_;
    int capacity_;
};


int std_move() {
    auto mv = my_vec{5};
    auto mv2 = my_vec{mv};
    // If we don't wrap this in a std::move(mv), i.e. if we just had: auto mv3 = my_vec(mv), the compiler
    // would just call the Copy Constructor
    auto mv3 = my_vec(std::move(mv));
}