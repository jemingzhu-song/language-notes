#include <unordered_set>
#include <iostream>

int unordered_set() {
    /*
     * std::unordered_set is a generic hash set that can store and retrieve elements
     * in constant time by using a hashing function.
     *
     * Compared to std::set, the elements in an std::unordered_set have no inherent ordering.
     *
     * Implemented using a hash table where keys are hashed into buckets of a hash table so that the insertioin
     * is always randomised.
    */

    // The functions/operations of an unodered_set are the same as that of a set
    std::unordered_set years = {1996, 2006, 2020};

    // 1. Add elements
    years.insert(2016);
    years.emplace(2023);

    // 2. Erase elemnents
    years.erase(2020);

    // 3. Check if element in set
    std::cout << years.contains(1996) << std::endl;

    // 4. .find()
    if (years.find(2006) == years.end()) {
        std::cout << "2006 is not in the set" << std::endl;
    } else {
        std::cout << "2006 found in the set" << std::endl;
    }

    return 0;
}