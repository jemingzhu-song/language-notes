#include <iostream>

/*
 * Covariants
 * https://youtu.be/WTi1m2ULBiQ?t=1600
 *
 * • If a function overrides a base, which type can it return?
 *      • If a base specifies that it returns a LandAnimal, a derived also needs to return
 *        a LandAnimal
 * • Every possible return type for the derived must be a valid return type for the base
*/
class Animal {};

class LandAnimal: public Animal {};

class Dog: public LandAnimal {};

class Base {
    virtual LandAnimal &get_favourite_animal_1();
    virtual LandAnimal &get_favourite_animal_2();
    virtual LandAnimal &get_favourite_animal_3();
};

class Derived: public Base {
    // Fails to compile: Not all "Animals" are "LandAnimals"
//        Animal& get_favourite_animal_3() override; // fails to compile

    // Compiles: All land-animals are "LandAnimals"
    LandAnimal& get_favourite_animal_1() override;

    // Compiles: All "Dog" are "LandAnimals"
    Dog& get_favourite_animal_2() override;
};
