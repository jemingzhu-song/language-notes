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
 * In a language like Java, everything is a pointer. This allows code
 * like the below.
*/
int example1() {
    auto base = std::vector<BaseClass>();
    base.push_back(BaseClass{});
    base.push_back(SubClass{});
    base.push_back(SubClass{});

    return 0;
}

/*
 * However, this is not possible in C++ because objects are stored inline when you
 * push_back to the vector, and this leads to the Object Slicing Problem (discussed in
 * "inheritence.cpp" file).
 *
 * Therefore, if you want to store a polymorphic object, use a pointer. You can't use
 * references because in C++ you can't store a vector of references.
*/
int example2() {
    auto base = std::vector<std::unique_ptr<BaseClass>>();
    base.push_back(std::make_unique<BaseClass>());
    base.push_back(std::make_unique<SubClass>());
    base.push_back(std::make_unique<SubClass>());

    return 0;
}
