#include <iostream>
#include <set>

int sets() {
    std::set<std::string> days = {"Tuesday", "Thursday"};

    // 0. Iterate Over
    // *i will "dereference" the iterator (a pointer) to get the actual value
    for (auto i = days.begin(); i != days.end(); i++) {
        std::cout << *i << std::endl;
    }
    // Alternatively, you can use the for ":" loop
    for (auto i : days) {
        std::cout << i << std::endl;
    }

    // 1. Insert Elements via .insert() or .emplace()
    days.insert("Monday");
    days.emplace("Friday"); // .emplace() is preferred

    // 2. Erase Elements
    days.erase("Tuesday");
    days.erase("Sunday");

    // 3. Check if Element in Set
    std::cout << days.contains("TUesday") << std::endl; // false (0)
    std::cout << days.contains("Friday") << std::endl; // true (1)

    // 4. .find()
    /*
     * .find(k) searches the set for an element k and returns an iterator to it if found,
     * otherwise it returns an iterator to set::end.
    */
    if (days.find("Monday") == days.end()) {
        std::cout << "'Monday' not in the set" << std::endl;
    } else {
        std::cout << "'Monday' found in the set" << std::endl;
    }

    return 0;
}
