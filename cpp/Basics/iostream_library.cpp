#include <iostream>

// The <iostream> library/package is an in-built package that contains all the basic functions
// that you will need for a C++ program, including allowing you to read and write from output, etc.

// Although this allows you to avoid specifiying "std" before any of its functions, it's considered
// bad practice because it creates ambiguity once there are multiple libraries/packages (and some of
// them may have the same function name).
using namespace std;

int iostream_library() {
    // We don't need to write: std::cout because we have defined a namespace for "std" at the start
    // of the file.
    cout << "Hello World Again!";

    return 0;
}