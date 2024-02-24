#include <iostream>
/*
 * By default, member functions in classes are only callable by NON-CONST objects.
 *
 * You can declare a const member function, which is callable by both const and non-const objects.
 *
 * To declare a const member functions, just put the "const" keyword just before the "{" opening bracket of the
 * function body:
 *      <returnType> <functionName>(<params) const {
 *          // body
 *      }
 *
 * Const Member Functions cannot modify the fields of a class.
 *
 * Ideally, we want all member functions to be "CONST" member functions, unless they are mutating/changing fields.
*/
class fruit {
public:
    fruit(std::string type, int calories): type_{type}, calories_{calories} {}

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

int const_member_functions() {
    const fruit f1 = fruit("Apple", 22);
    f1.details();
    // f1.calories(); // Can't call because this is a const object, so can't call a non-const member function


    return 0;
}