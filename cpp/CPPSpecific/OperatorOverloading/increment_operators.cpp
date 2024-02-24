#include <iostream>

class point {
public:
    point(int x, int y): x_{x}, y_{y} {};

    // Member Operator Overloading
    point& operator++(); // This is for prefix ++, e.g. ++i;
    point& operator++(int i); // This is for postfix ++, e.g. i++;


private:
    int x_;
    int y_;
};

point& point::operator++() {
    x_++;
    y_++;
    return *this;
}

point& point::operator++(int i) {
    x_++;
    y_++;
    return *this;
}

int increment_operators () {
    point p1 = point(5, 9);
    ++p1; // Prefix ++
    p1++; // Postfix ++
    return 0;
}
