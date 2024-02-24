#include <iostream>
// https://youtu.be/n5Mbxgy_OQs?t=5979

/*
 * In C++, if you don't specify any constructor at all, C++ will generate a "default" constructor behind the
 * scenes, which will allow you to create an object from that class without passing in anything into the constructor.
 *
 * However, this behaviour goes away once you specify at least one constructor. If you want to "enable" this
 * behaviour, you can use:
 *      <constructorName>() = default;
 *
 * If you want to "disable" this behaviour, instead of "default", use "delete":
 *      <constructorName>() = delete;
*/

class fruit {
public:
    fruit(std::string type, int calories): type_{type}, calories_{calories} {}
    // "Enable" Synthesised Constructor
    fruit() = default;
    // "Disable" Synthesised Constructor
//    fruit(fruit const &f) = delete; // If you uncomment this, line 47 will throw an error

    // Default Function (Non-Const Member Function)
    std::string calories() {
        return "Calories: " + calories_;
    }

    // Const Member Function
    std::string details() const {
        return type_ + " | " + std::to_string(calories_);
    }

private:
    std::string type_;
    int calories_;
};

int synthesised_constructor() {
    fruit f1 = fruit("Apple", 23);

    // Using the "Synthesised" Constructors
    fruit f2 = fruit();
    // Here, we are allowed to create a "fruit" object from another "fruit" object, thanks to
    // Synthesised Constructors. Notice how we never actually manually specified a constructor to handle the
    // case where an object is passed in as a parameter. This is a "Synthesised Constructor" by C++
    fruit f3 = fruit(f1);

    std::cout << f3.details() << std::endl;


    return 0;
}