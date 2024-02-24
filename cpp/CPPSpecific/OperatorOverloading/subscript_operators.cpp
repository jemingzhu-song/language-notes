#include <iostream>
#include <cassert>

class point {
public:
    point(int x, int y): x_{x}, y_{y} {};

    // Member Operator Overloading
    // This allows us to use "indexing" for our "point" class. It allows us to access
    // the "x_" value by calling: <pointVariableName>[0], and the "y_" value by calling:
    // <pointVariableName>[1].

    /* This is the "setter" version */
    int& operator[](int i) {
        assert(i == 0 or i == 1); // We have this assertion to make sure the index is either 0 or 1.
        return i == 0 ? x_ : y_;
    }

    /* This is the "getter" version */
    const int& operator[](int i) const {
        assert(i == 0 or i == 1); // We have this assertion to make sure the index is either 0 or 1.
        return i == 0 ? x_ : y_;
    }

private:
    int x_;
    int y_;
};

int subscript_operators() {
    point p1 = point(55, 9);

    int first = p1[0];
    int second = p1[1];

    // Change using the index operator
    p1[0] = 100;
    std::cout << p1[0] << std::endl;

    return 0;
}

