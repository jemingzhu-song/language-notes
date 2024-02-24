#include <vector>
#include <iostream>

class point {
public:
    point(int x, int y): x_{x}, y_{y} {};

    // Type Conversion Operator
    operator std::vector<int>() {
        return std::vector<int>{x_, y_};
    }

private:
    int x_;
    int y_;
};

int type_conversion_operator() {
    point p1 = point(5, 10);

    // How to use type conversion operator
    auto converted1 = std::vector<int>(p1);
    auto converted2 = static_cast<std::vector<int>>(p1);
    std::vector<int> converted3 = p1;

    for (auto element : converted3) {
        std::cout << element << std::endl;
    }

    return 0;
}