#include <iostream>

/*
 * https://www.geeksforgeeks.org/operator-overloading-c/
 * C++ supports operator overloading. Operator overloading is similar to function/method overloading,
 * however, it allows you to overload operators. Operators are the same as normal functions, the only
 * difference is that the name of an operator function is always the operator keyword followed by the
 * symbol of the operator. For example, the "+" symbol is an operator function that can be used as such:
 * 12 + 5.
 *
 * Advantages of Operator Overloading:
 *      • Reuse existing code semantics
 *      • No verbosity required for simple operations
 * Disadvantages of Operator Overloading:
 *      • Lack of context on operations
 *
 * Only create an overload if your type has a single, obvious meaning to an operator
*/

class point {
public:
    point(int x, int y): x_{x}, y_{y} {};

    // Using Operator Overloading
    friend point operator+(point &lhs, point &rhs);
        // This is similar to overloading the .toString() method in Java/Kotlin
    friend std::ostream& operator<<(std::ostream &os, point &p);

    // Not Using Operator Overloading (Traditional Approach)
    static point addPoints(point &lhs, point &rhs) {
        return point(lhs.x_ + rhs.x_, lhs.y_ + rhs.y_);
    }
    static void printPoint(point &p) {
        std::cout << "(" << p.x_ << ", " << p.y_ << ")" << std::endl;
    }

private:
    int x_;
    int y_;
};

// Implementing the two "friend" operator overloading functions.
point operator+(point &lhs, point &rhs) {
    return point(lhs.x_ + rhs.x_, lhs.y_ + rhs.y_);
}

std::ostream& operator<<(std::ostream &os, point &p) {
    os << "(" << p.x_ << ", " << p.y_ << ")";
    return os;
}

int operator_overloading() {
    point p1 = point(1, 2);
    point p2 = point(2, 3);

    // Without Operator Overloading - this is long and ugly
    point result = point::addPoints(p1, p2);
    point::printPoint(result);

    // With Operator Overloading
    point result_again = p1 + p2;
    std::cout << result_again;

    return 0;
}