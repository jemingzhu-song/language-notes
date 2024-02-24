#include <iostream>

class Animal {
public:
    Animal() = default;
private:
    std::string species_;
};

class Dog : public Animal {
public:
    Dog() = default;
private:
    std::string breed_;
};


/*
 * Up-Casting
 *
 * • Casting from a derived class to a base class is called up-casting.
 *      • This cast is always safe. e.g. All dogs are animals
 * • Because the cast is always safe, C++ allows this as an implicit cast
 * • One of the reasons to use "auto" is that it avoids implicit casts
*/
int up_casting() {
    auto dog = Dog();

    // Up Casting with References
    Animal &animal_ref = dog;

    // Up Casting with Pointers
    Animal *animal_ptr = &dog;

    return 0;
}

