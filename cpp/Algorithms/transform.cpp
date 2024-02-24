#include <iostream>
#include<algorithm>

// This is a std::toupper function that is taken from here: https://en.cppreference.com/w/cpp/string/byte/toupper
char my_toupper(char ch)
{
    return static_cast<char>(std::toupper(static_cast<unsigned char>(ch)));
}

int transform() {
    /*
     * std::transform is the same as the .map() function in Java/Kotlin. It will take an "existing" container,
     * and then iterate over the existing container, and apply a "rule" to each element in that container, and
     * save/output it to a "new" container.
     *
     * However, std::transform is not like the .push_back() function or likewise (which dynamically allocates
     * additional memory), because std::transform only mutates, and does not dynamically add additional space/
     * capacity/memory.
    */

    std::string toTransform = "hello world";
    // Here, we are initialising a "new" string container of size "toTransform" and each character is currently a
    // null value (as represented by \0)
    std::string transformed = std::string(toTransform.size(), '\0');

    std::transform(toTransform.begin(), toTransform.end(), transformed.begin(), my_toupper);

    std::cout << transformed << std::endl;

    return 0;
}
