/*
 * Vectors are basically "Dynamic Arrays" in C++, equivalent to ArrayList in Java/Kotlin
 *
 * To use vectors, you need to #include <vector>
*/
#include <vector>
#include <iostream>

int vectors() {

    std::vector<std::string> names = {"Danny", "Kenny", "William"};

    // 0. Iterate Over
    for (int i = 0; i < names.size(); i++) {
        std::cout << names[i] << std::endl;
    }

    // 0. A) .capacity() - how many elements the vector can HOLD - when you add extra elements,
    // the capacity will increase
    std::cout << names.capacity();
    // 0. B) .size() - how many elements the vector CURRENTLY HAS
    std::cout << names.size();

    // 1. Add Elements
    names.push_back("Michael");
    names.push_back("Adam");
    names.push_back("Charles");
    names.push_back("Zion");
    names.push_back("Brian");

    // 2. Get Elements
    std::cout << names[2]; // Certain Element
    std::cout << names.front(); // Front of Vector: .front()
    std::cout << names.back(); // Back of Vector: .back()

    // 3. Edit Elements
    names.at(2) = "KENNY"; // Change element at index 2 to value of: -1
    names[2] = "KENNY"; // Alternative method

    // 4. Remove Elements
    names.pop_back(); // Remove last element: .pop_back() doesn't return anything
    names.erase(names.begin() + 1); // Remove elements by index

    // 5. Insert Element At Position
    /*
     * .insert(<indexToInsertElementStraightAfter>, <value>)
    */
    names.insert(names.begin() + 2, "Penelope"); // Insert element at index 3

    // 6. Erase (Remove) Element at Position
    /*
     * .erase(<indexToEraseElementFrom>)
    */
    names.erase(names.begin() + 2);

    return 0;
}
