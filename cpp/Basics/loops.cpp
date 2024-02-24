#include <iostream>
#include <vector>

int loops() {
    std::vector<std::string> stuff = {"Hello", "everyone", "and", "welcome"};

    // 1. For "classic" loop
    for (int i = 0; i < stuff.size(); i++) {
        std::cout << stuff[i] << std::endl;
    }

    // 2. For "iterator" loop
    for (auto i = stuff.begin(); i != stuff.end(); i++) {
        std::cout << *i << std::endl;
    }

    // 3. For ":" loop
    /*
     * Here, we are using "&" to make it a reference because if we don't use it, we will essentially
     * be copying each element "s" inside the for loop, which is inefficient.
    */
    for (std::string& s : stuff) {
        std::cout << s << std::endl;
    }

    return 0;
}
