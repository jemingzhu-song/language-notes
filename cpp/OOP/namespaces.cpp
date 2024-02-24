#include <iostream>
/*
 * The scope of a variable is the part of the program where it is accessible. The scope starts at the
 * variable definition, and usually ends at the next closing bracket "}". If you put an open bracket "{", you
 * have created a new scope which ends until the closed brace "}".
*/

int i = 1;
int scopes() {
    std::cout << "Scope 1: " << i << std::endl;
    if (i > 0) {
        int i = 2;
        std::cout << "Scope 2: " << i << std::endl;
        {
            int i = 3;
            std::cout << "Scope 3: " << i << std::endl;
        }
    }
    return 0;
}

/*
 * Namespaces in C++ allow you to define a custom "scope" and give that custom "scope" a name that you can reference.
 * Namespaces can only be created:
 *      - At global scope
 *      - At namespace scope (nested namespace)
 * Once you have created a namespace, you can "call" the variables and/or functions defined inside of that scope.
 *      - Entities inside accessed with the scope operator ::\
 * Namespaces are somewhat similar to classes/structs.
 */
namespace person {
    std::string name = "Michael";
}

namespace animal {
    std::string name = "Milo";
}

namespace car {
    std::string name = "Volvo";

    std::string startup() {
        return "brmbrmbrmbrmmmmmmmm";
    }
}

/*
 * If we don't want to keep calling "::" to call elements inside a specific scope, we can use the:
 *      using namespace <namespace name>;
 *
 * This is not good practice, since it "pollutes" the scope, because if there are the same variable or function
 * names, then the compiler will pick this error up.
*/

int namespaces() {

    std::cout << person::name << std::endl; // Michael

    // This allows us to call variables/functions inside of the "car" namespace without having to use the
    // "::" to access the elements. This is BAD PRACTICE.
    using namespace car;
    std::cout << name << std::endl; // Volvo
    std::cout << startup() << std::endl;

    return 0;
}