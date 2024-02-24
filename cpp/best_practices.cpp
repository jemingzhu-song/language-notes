#include <iostream>
/*
 * C++ Best Practices
*/

/*
 * 1. Function/Method parameters should be pass-by-reference unless otherwise.
*/
std::string grade(int &mark) {
    // do stuff
}

/*
 * 2. Function/Method parameters should be "const" if they will not be modified
*/
std::string getGrade(int const& mark) {

}

std::string getGradeAlternate(const int& mark) {

}

class exampleClass1 {
public:
    /*
    * 3. Member Functions/Methods that do not modify data should be "const" so that they can be called by
     * both "const" and "non-const" variables.
    */
    auto data() const -> const char *;
    auto size() const -> int;

    /*
    * 4. Member Functions/Methods and Constructors in Classes should be specified with "noexcept" if
    * we are sure they won't throw an exception
    */
    exampleClass1() noexcept;
    std::string whatsUp() noexcept;
};

/*
 * 5. Move Constructors and Move Assignments should always be declared as "noexcept"
 */

/*
 * 6. unique_ptrs. When creating unique_ptrs, recommended to always use the std::make_unique() to
 * create as it avoids the need to use the "new" and "delete" keywords.
 */
int unique_ptrs() {
    auto up2 = std::make_unique<std::string>("Goodbye");
    std::cout << *up2 << std::endl;
    return 0;
}

/*
 * 7. You almost always want to use a UNIQUE POINTER instead of a SHARED POINTER as shared pointers
 */

/*
 * 8. When working with templates (function templates or class templates), we need to implement
 * template functions or template classes in the ".h" file (i.e. we need to include the
 * definitions/implementation in the ".h" file as well), instead of the ".cpp" file.
 *
 * This is different to normal functions/classes, where the declaration can be in the ".h" file but the
 * definition must be in the ".cpp" file.
 *
 * This is due to the Inclusion Compilation Model
 */