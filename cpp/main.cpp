#include <iostream>

// there are lots of bugs in a forest...
auto forest() -> decltype(auto) {
    auto msg = "q9";
    auto fn1 = [&msg](){ std::cout << msg; };
    const auto &fn2 = fn1;
    return fn2;
}

int main() {
    auto &&f = forest();
    std::cout << "The message is: ";
    f();
    std::cout << std::endl;
}

