#include <iostream>
/*
 * Operator Overloading in C++ also has "Member Operator Overloading", where the
 * operator functions are operating on the "this" object, instead of being at a global/static scope
 * (which is the "friend" operators).
 */
class point {
public:
    point(int x, int y): x_{x}, y_{y} {};
    std::string toString() {
        return "(" + std::to_string(x_) + ", " + std::to_string(y_) + ")";
    }
    // Using Member Operator Overloading
    point& operator+=(point &p);
    point& operator-=(point &p);
    point& operator*=(int i);

private:
    int x_;
    int y_;
};

// Member Operator Overloading
/* Notice how this is different to the "friend" operator implementation (which are global scope functions).
*  These member operator functions are defined within the class scope (in this case, the "point" class):
*  point::operator <operatorType>() {
*       // function body
*   }
*/
point& point::operator*=(int i) {
    x_ *= i;
    y_ *= i;
    return *this;
}

point& point::operator+=(point &p) {
    x_ += p.x_;
    y_ += p.y_;
    return *this;
}

point& point::operator-=(point &p) {
    x_ -= p.x_;
    y_ -= p.y_;
    return *this;
}

int compound_assignment() {
    point p1{1, 2};
    point p2{3, 4};

    p1 += p2;
    std::cout << p1.toString() << std::endl;

    point p3{1, 2};
    int scaleBy = 5;
    p3 *= scaleBy;
    std::cout << p3.toString() << std::endl;
}