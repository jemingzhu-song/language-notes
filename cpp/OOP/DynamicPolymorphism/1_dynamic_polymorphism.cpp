/*
 * Key Concepts
 *
 * • Inheritence: ability to create new classes based on existing ones.
 *      • Supported by class derivation
 * • Polymorphism: allows objects of a subclass to be used as if they were objects of a
 *   base class (i.e. the parent class).
 *      • e.g. class Car {}, class Toyota extends Car{}, class Honda extends Car{}
 *        Polymorphism allows you to write:
 *        Car c1 = new Toyota();
 *        Car c2 = new Honda();
 * • Dynamic Binding: Run-Time resolution of the appropriate function to invoke based on the type of
 *   the object.
 *      • Closely related to polymorphism
 *      • Supported via virtual functions
*/

/*
 * Tenets of C++
 *
 * Don't pay for what you don't use
 *  • C++ Supports OOP - no runtime performance penalty
 *  • C++ Supports generic programming with the STL and templates - no runtime performance penalty
 *  • Polymorphism is extremely powerful, and we need it in C++
 *      • Do we need polymorphism at all when using inheritance?
 *          • Answer: sometimes
 *          • But how do we do so, considering that we don't want to make anyone who doesn't use it
 *            pay as a performance penalty
*/

/*
 * Inheritence vs. Composition
 *
 * • Inheritence: A is also a B, and can do everything B does
 *      • "is a" relationship
 *      • A dog "is an" animal
 * • Composition (data member): A contains a B, but isn't a B itself
 *      • "has a " relationship
 *      • A person "has a" name
*/
