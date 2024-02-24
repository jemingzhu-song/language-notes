#include <unordered_map>
#include <iostream>

int unordered_map() {
    /*
     * std::unordered_map is a generic hash map that can store and retrieve elements
     * in constant time by using a hashing function.
     *
     * Compared to std::map, the keys in an std::unordered_map are not stored in any inherent
     * order.
    */

    // The functions/operations of an unodered_set are the same as that of a map
    std::unordered_map<int, std::string> people = {
            {32, "Michael"},
            {0, "James"}
    };

    // 1. Insert elements using .insert() or .emplace()
    people.insert({21, "William"});
    people.emplace(1, "Adam");

    // 2. Get elements
    std::cout << people.at(2) << std::endl;
    std::cout << people[1] << std::endl;

    return 0;
}
