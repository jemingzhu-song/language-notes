#include <iostream>

int references() {
    /*
     * ========== References ==========
     * C++ supports C-style pointers, but also offers references.
     *
     * A reference is an alias to another object, it can be used as you would use
     * the original object/variable.
     *
     * A reference:
     *  • Has no need to use "->" to access members
     *  • Cannot be null (no null references)
     *  • Once bound to an object, cannot be rebound
     *
     * Under the hood, references are implemented as pointers.
    */
    float pi = 3.14f;
    /*
     * To create a reference, put an "&" symbol either after the data type or before the variable name.
     * This is totally up to preference, there is no difference in either approach:
     *      float& pi_ref = pi
     *      float &pi_ref = pi
     * Both of the above approaches work.
     *
    */
    float& pi_ref = pi;

    pi_ref = 3.5; // This will also change "pi" to 3.5 since pi_ref is a reference to pi
    assert(pi == 3.5); // Since pi_ref is just an alias for pi

    /*
     * ========== References & const ==========
     *
     * A reference to const means you cannot modify the original object through this reference.
     *
     * It may still be possible to modify the original object through ANOTHER reference.
     * Note that the references are always "top-level" const, but can optionally be
     * bottom-level const
     *
    */
    int i = 1;
    const int &ref = i;
    i++; // This is fine
    // ref++; // This is not fine since "ref" is a cons

    const int j = 1;
    const int &jRef = j; // This is allowed
    // int &jRefAgain = j; // This is not allowed

    return 0;
}