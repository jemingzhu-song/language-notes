#include <optional>
#include <iostream>

std::optional<std::string> grade(int mark) {
    if (mark < 50) {
        return "FL";
    } else if (mark >= 50 && mark <= 100) {
        return "PS";
    } else {
        return std::nullopt; // If do nothing, return std::nulloppt
    }
}

int std_optional() {
    /*
     * std::optional represents a nullable type holding a value or nothing at all. It is Type-Safe, it cannot
     * access the element if it does not exist
    */
    std::optional<std::string> result = grade(23);
    if (result) {
        std::cout << "Result is valid" << std::endl;
    } else {
        std::cout << "Result is not valid" << std::endl;
    }

    std::optional<std::string> result1 = grade(2322);
    if (result1) {
        std::cout << "Result is valid" << std::endl;
    } else {
        std::cout << "Result is not valid" << std::endl;
    }

    return 0;
}
