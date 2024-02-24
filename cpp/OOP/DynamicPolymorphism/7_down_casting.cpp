#include <iostream>

class Animal {
public:
    Animal() = default;
    virtual std::string species() = 0; // makes this "Animal" class Polymorphic
private:
    std::string species_;
};

class Cat : public Animal {
public:
    Cat() = default;
    std::string species() override {
        return "Cat 'species'";
    }
private:
    std::string type_;
};

class Dog : public Animal {
public:
    Dog() = default;
    std::string species() override {
        return "Dog 'species'";
    }
private:
    std::string breed_;
};

/*
 * Down Casting
 *
 * • Casting from a base class to a derived class is called Down-Casting.
 * • This is not safe - not all animals are dogs
*/
int down_casting() {
    auto dog = Dog();
    auto cat = Cat();

    Animal& animal_dog{dog};
    Animal& animal_cat{cat};

    // Attempt to down-casting with references. The line below won't compile
    // Dog& dog_ref{animal_dog}; // This won't compile

    /*
     * How to "properly" down-cast
     *
     * • The compiler doesn't know if an Animal happens to be a Dog
     *      • If you know it is a dog, you can use static_cast - since it basically "forces"
     *        a cast.
     *      • Otherwise, you can use dynamic_cast
     *              • Returns null pointer for pointer types if it doesn't match
     *              • Throws exception for reference types if it doesn't match
    */
    /* Attempt to down-cast with references */
    Dog& dog_ref_static{static_cast<Dog&>(animal_dog)};
    Dog& dog_ref_dynamic{dynamic_cast<Dog&>(animal_dog)};
    // Undefined behaviour (incorrect static cast)
    Dog& cat_ref_static{static_cast<Dog&>(animal_cat)};
    // Throws exception
    Dog& cat_ref_dynamic{dynamic_cast<Dog&>(animal_cat)};

    /* Attempt to down-cast with pointers */
    Dog* dog_ptr_static{static_cast<Dog*>(&animal_dog)};
    Dog* dog_ptr_dynamic{dynamic_cast<Dog*>(&animal_dog)};
    // Undefined behaviour (incorrect static cast)
    Dog* cat_ptr_static{static_cast<Dog*>(&animal_cat)};
    // Throws exception
    Dog* cat_ptr_dynamic{dynamic_cast<Dog*>(&animal_cat)};

    return 0;
}