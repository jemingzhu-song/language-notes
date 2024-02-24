#include <iostream>

// Function Template:
/*
 *  <returnType> functionName (<dataType1> param1, <dataType2> param2) {
 *      return <returnType>;
 *  }
*/

/*
 * In C++, the function must be declared before it is used. To make our code cleaner, we can
 * declare a function but not initialise/define it. We can then define it later on in the file.
*/
std::string getGrade(int mark, bool special);

int functions() {
    std::cout << getGrade(86, false) << std::endl;
    std::cout << getGrade(21, false) << std::endl;
    std::cout << getGrade(44, true) << std::endl;

    return 0;
}

// 1. Class Function Style
std::string getGrade(int mark, bool special) {
    if (mark < 50) {
        if (special) {
            return "PS";
        } else {
            return "PS";
        }
    } else if (mark >= 50 && mark < 75) {
        return "CR";
    } else if (mark >= 75 && mark < 85) {
        return "DS";
    } else if (mark >= 85 && mark <= 100) {
        return "HD";
    } else {
        return "NA";
    }
}

// 2. "Auto" -> Style
auto getMark(std::string grade) -> int {
    if (grade == "PS") {
        return 50;
    } else {
        return 100;
    }
}
