#include <iostream>
#include <vector>
#include <list>
/*
 *  Default Members in Templates
 *
 *  Similar to default arguments for function parameters in C++ (and in Kotlin), we can have the template
 *  typename have a "Default Value" if it is not specified.
*/

/*
 * Templates can also have multiple template types.
 *
 * In the example below, we can initialise the below "stack" with either one type "T" specified or both
 * types specified "CONT", e.g:
 *      auto s1 = stack<float>{};
 *      auto s2 = stack<float, std::list<float>>{};
 *
 * typename CONT = std::vector<T> is a "container" that holds our template type "T". The default value
 * of CONT (if none is specified), is std::vector<T>
*/
template<typename T, typename CONT = std::vector<T>>
class stack {
public:
    stack();
    ~stack();
    auto push(T const& item) -> void {
        /*
         * Be careful here, because "stack_" is of type "CONT", and if CONT is defined not as a
         * std::vector or std::list (which have the push_back() function), such as a std::unordered_set,
         * then this will cause a runtime error, because std::unordered_set does not have a valid
         * push_back() function.
        */
        stack_.push_back(item);
    }
    auto pop() -> void;
    auto top() -> T&;
    auto top() const -> const T&;
    auto empty() const -> bool;
private:
    // Our default value is CONT = std::vector<T>
    CONT stack_;
};

// When implementing the constructors/member functions, make sure to not include the default member value
// in the template specification:
template<typename T, typename CONT>
stack<T, CONT>::stack() {
    // constructor
}

template<typename T, typename CONT>
stack<T, CONT>::~stack() {
    // destructor
}

int main_driver_8_templates_multiple_types() {
    auto fs = stack<float, std::list<float>>{};
    float k = 5;

//    std::cout << fs.top() << std::endl;


   return 0;
}