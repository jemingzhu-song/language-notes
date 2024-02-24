#include <iostream>
#include <vector>

class BaseClass {
public:
    int get_int_member() { return int_member_; };
    std::string get_class_name() {
        return "BaseClass";
    }

private:
    int int_member_;
    std::string string_member_;
};

class SubClass : public BaseClass {
public:
    std::string get_class_name() {
        return "Subclass";
    }

private:
    std::vector<int> vector_member_;
    std::unique_ptr<int> ptr_member_;
};

/*
 * Static vs. Dynamic Binding
 *
 * Static Binding: Decide which function to call at compile time (based on static type)
 * Dynamic Binding: Decide which function to call at runtime (based on dynamic type)
 *
 * C++
 *  • Statically typed (types are calculated at compile time)
 *  • Static binding for non-virtual functions
 *  • Dynamic binding for virtual functions
 * Java
 *  • Statically typed
 *  • Dynamic Binding
*/
int static_vs_dynamic_binding() {
    // static binding: s => SubClass
    // dynamic binding: s => SubClass
    SubClass s = SubClass{};

    // static binding: b => BaseClass
    // dynamic binding: b => SubClass
    BaseClass &b = s;

    return 0;
}

/*
 * Static and Dynamic Types
 * https://youtu.be/WTi1m2ULBiQ?t=730
 * Static Type is the type a variable is declared as (the LHS)
 * Dynamic Type is the type of the object itself
 *
 * Static means "compile-time", and Dynamic means "runtime"
 *      • Due to object slicing, an object that is neither a reference or pointer will always
 *        have the same static and dynamic type (because the dynamic type will take on the
 *        type of the static type due to the Object Slicing Problem).
*/