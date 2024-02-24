#include <iostream>

/*
 * C++ classes are similar to classes in Java/Kotlin.
 *
 * The key differences between C++ classes and Java/Kotlin classes are:
 *      • You can declare variables and methods without defining them. You can define them later OUTSIDE
 *        of the class.
 *      • You group variables and methods inside visibility modifiers instead of individually specifying it for
 *        each individual variable or method.
 *
 * Classes in C++ are usually defined in a ".h" file instead of a ".cpp" file. To use the class, simply
 * #include "./filename.h".
 *
 * In C++, it is convention to name the fields with a trailing underscore "_" instead of making it the same
 * name and then using "this" keyword. This is because you can't use the "this" keyword for Member Initialiser List
 * constructors
*/

class person {
public:
    // Constructors
    person();
    person(std::string firstName, std::string lastName) {
        this->firstName = firstName;
        this->lastName = lastName;
    }
    person(std::string firstName, std::string lastName, int age) {
        this->firstName = firstName;
        this->lastName = lastName;
        this->age = age;
    }
    // Getters & Setters
    std::string getFirstName() {
        return this->firstName;
    }
    void setFirstName(std::string firstName) {
        this->firstName = firstName;
    }
    std::string getLastName() {
        return this->lastName;
    }
    int getAge() {
        return this->age;
    }
    // Public fields/methods
    std::string toString() {
        return this->firstName + " | " + this->lastName + " | " + std::to_string(this->age);
    }
    std::string governmentName();

private:
    // Private fields/variables of this class
    std::string firstName;
    std::string lastName;
    int age;
    // Private functions
    std::string secret(int code); // We don't have to implement the functions in a class in C++
};

// We can implement the "secret()" method here, outside the scope of the class, or even in a separate file
// where the class is used (i.e. in the ".cpp" file). We use the "::" to specify the "scope" of this class.
std::string person::secret(int code) {
    if (code == 1) {
        return "Potato Secret";
    } else if (code == 2) {
        return "Rock Secret";
    } else {
        return "Wrong Code";
    }
}