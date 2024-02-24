#include <iostream>
#include "./classes.h"

int classes() {

    // Initialising Objects
    // Method 1 to Initialise Object: <classType> <variableName> = <constructor>()
    person p1 = person("Michael", "Smith", 22);
    // Method 2 to Initialise Object: <classType> <variableName>()
    person p2("William", "Chen", 15);

    std::cout << p1.toString() << std::endl;

    p1.setFirstName("MICHAEL");

    std::cout << p1.toString() << std::endl;

    return 0;
}

// Implement the "governmentName()" function in the "person" class
/*
 * The reason we may want to implement the methods in the actual ".cpp" files instead of in the ".h" file where
 * the class is defined is because if multiple files include the "./classes.h" file, and this method is implemented
 * in there as well, it will need to "copy" this method into all of those files, which adds to the compilation time
*/
std::string person::governmentName() {
    return this->firstName + " " + this->lastName;
}
