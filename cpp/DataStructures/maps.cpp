/*
 * Maps are essentially the same as HashMaps in Java/Kotlin.
 *
 * To use vectors, you need to #include <map>
*/
#include <iostream>
#include <map>

int maps() {

    std::map<int, std::string> people = {
            {2, "Adam"},
            {5, "Brian"},
            {3, "Zion"}
    };

    // 0. Iterate Over
    // Using the iterator, you can reference the key and value via:
    // iterator->first (for Key) and iterator->second (for Value)
    // The -> is basically "deferencing" the iterator to get the actual value. i->first is equivalent to writing:
    // (*i).first and i->second is equivalent to writing: (*i).second
    for (auto i = people.begin(); i != people.end(); i++) {
        std::cout << i->first << " : " << i->second << std::endl;
    }

    // 1. Insert into Map using .emplace() or .insert()
    // Four ways to insert into a map
    people.emplace(4, "Penelope"); // Using .emplace() - This is the preferred way to insert
    people[1] = "Xavier"; // Using [] operator
    people.insert({9, "Charles"}); // Using {} notation
    people.insert(std::pair<int, std::string>(6, "Danny")); // Using std::pair<type1, type2>() notation

    // 2. Get Elements
    std::cout << people.at(2) << std::endl; // .at()
    std::cout << people[3] << std::endl; // [] operator
    // Alternative method using .find() - See below section 5.

    // 3. Edit Elements using [] operator
    std::cout << people.at(9) << std::endl;
    people[9] = "CHARLES";
    std::cout << people.at(9) << std::endl;

    // 4. Remove Elements using .erase()
    people.erase(2);

    // 5. .find() Method
    /*
     * .find(k) searches the map for an element with a key equivalent to k and returns an iterator to it if found,
     * otherwise it returns an iterator to map::end.
    */
    std::map<int, std::string> mapExample = {
            {2, "Apple"},
            {3, "Banana"},
            {4, "Dragonfruit"}
    };
    // A) Change element based off iterator
    auto toChange = mapExample.find(2);
    toChange->second = "APPLE";
    std::cout << mapExample.at(2) << std::endl;
    // B) Check if element is in the map
    if (mapExample.find(10) == mapExample.end()) {
        std::cout << "Key: 10 is not in the map" << std::endl;
    }

    // 6. .contains() Method
    /*
     * .contains(k) also only checks for an element with a key equivalent to k
    */
    if (mapExample.contains(2)) {
        std::cout << "Contains key: 2 in mapExample" << std::endl;
    }

    // Sorting Maps
    /*
     * Maps store the keys in a default order. If you want to change/customise this ordering, you pass it into
     * an "Alocate" parameter when you initialise the map
    */
    std::map<int, std::string, std::greater<>> names = {
            {2, "Richard"},
            {5, "Adam"},
            {10, "Michael"},
            {4, "William"},
            {3, "Brian"}
    };

    for (auto i = names.begin(); i != names.end(); i++) {
        std::cout << i->first << " : " << i->second << std::endl;
    }

    return 0;
}