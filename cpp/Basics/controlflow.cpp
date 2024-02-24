#include <iostream>

int controlflow() {
    /*
     * C++ also offers the tenary operator
    */
    int value = 23;
    std::string result = value % 2 == 0 ? "even" : "odd";

    /*
     * switch Statement
     *
     * switch(<value>) {
     *  case <case1>:
     *      // logic
     *      break;
     *  default:
     *      // logic
     *      break;
     * }
    */
    int passIn;
    std::cout << "Enter a value:" << std::endl;
    std::cin >> passIn;
    switch(passIn) {
        case 1:
            std::cout << "Monday";
            break;
        case 2:
            std::cout << "Tuesday";
            break;
        default:
            std::cout << "Default";
            break;
    }

    return 0;
}
