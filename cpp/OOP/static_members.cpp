#include <iostream>

/*
 * Static Members in C++ are similar to static keyword in Kotlin (companion object) and Java.
*/

class user {
public:
    user(std::string name): name_{name} {}

    // Static Member
    static bool checkValidName(std::string name) {
        return name.length() > 1;
    }

private:
    std::string name_;
};

int static_members() {
    user u1 = user( "Michael");
    std::cout << user::checkValidName("Michael") << std::endl;
    std::cout << user::checkValidName("") << std::endl;

    return 0;
}
