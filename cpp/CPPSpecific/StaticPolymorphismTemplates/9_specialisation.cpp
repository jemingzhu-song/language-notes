#include <iostream>
#include <vector>
#include <numeric>
/*
 * Specialisation
 *
 * • The templates we've defined so far are completely generic.
 * • There are two ways we can redefine our generic types for something more specific:
 *      1. Partial Specialisation
 *          • Describing the template for another form of the template
 *              • T*
 *              • std::vector<T>
 *      2. Explicit Specialisation
 *          • Describing the template for a specific, non-generic type
 *          • std::string
 *          • int
 */

/*
 * When to Specialise
 *
 * • You need to preserve existing semantics for something that would not otherwise work.
 *      • std::is_pointer is partially specialised over pointers
 * • You want to write a type trait
 *      • std::is_integral is fully specialised for int, long, etc.
 * • There is an optimisation you can make for a specific type
 *      • std::vector<bool> is fully specialised to reduce memory footprint
*/

/*
 * When NOT to Specialise
 *
 * • Don't specialise functions:
 *      • A function cannot be partially specialised
 *      • Fully specialised functions are better done with overloads
 * • You think it would be cool if you changed some feature of the class for a specific type
 *      • People assume a class works the same for all types
 *      • Don't violate assumptions!
*/

/*
 * 1. Partial Specialisation
*/

/*
 * 1. Example of Partial Specialisation
 *
 * • In this case, we will specialise for pointer types
 *      • Why do we need to do this?
 * • You can Partially Specialise Classes - you cannot partially specialise a particular function of a
 *   class in ISOLATION.
 *      • This means you have to re-write an entire separate class for this Partial Specialisation "case"
 *
*/
template<typename T>
class stack {
public:
    /*
     * Within the Class Template, we don't need to put the line: template<typename T>
     * above every function declaration. But if we define the function here, then we need
     * the line.
    */
    auto push(T const& item) -> void { stack_.push_back(item); }
    auto pop() -> void { stack_.pop_back(); }
    auto top() -> T& { stack_.back(); }
    auto top() const -> const T& { stack_.back(); }
    auto empty() const -> bool { stack_.empty(); }
    /*
     * This function will be different for the Partial Speciailisation (Pointer Types)
    */
    auto sum() -> int {
        return std::accumulate(stack_.begin(), stack_.end(), 0);
    }
private:
    std::vector<T> stack_;
};

/*
 * Partial Specialisation of "Stack" for Pointer Types.
 *
 * We have:
 *      class stack<T*> {} instead of class stack {}
 *
 * Alternatively, we can have Partial Specialisation of vector of T, for example:
 *      class stack<std::vector<T>>
 */
template<typename T>
class stack<T*> { // We have stack<T*> instead of just "stack"
public:
    /*
     * Within the Class Template, we don't need to put the line: template<typename T>
     * above every function declaration. But if we define the function here, then we need
     * the line.
    */
    auto push(T const* item) -> void { stack_.push_back(item); }
    auto pop() -> void { stack_.pop_back(); }
    auto top() -> T* { stack_.back(); }
    auto top() const -> const T* { stack_.back(); }
    auto empty() const -> bool { stack_.empty(); }
    /*
     * This function is different for this Partial Speciailisation (Pointer Types)
    */
    auto sum() -> int {
        return std::accumulate(stack_.begin(), stack_.end(), 0, [](int a, T* b) { return a + *b; });
    }
private:
    std::vector<T*> stack_; // We have std::vector<T*> instead of just std::vector<T>
};

/*
 * Another Example of Partial Specialisation:
 *
 * Here, Partial Specialisation allows us to convert "types" into "values" that we can check in if-else
 * statements, etc, and this can be used to check the type of the generic type "T" in a Template Class.
*/
template<typename T>
struct is_void {
    static const bool value = false;
};

template<>
struct is_void<void> {
    static const bool value = true;
};

// Here, we have the ability to check if something is "void"
int driver_main() {
    std::cout << is_void<int>::value << std::endl;
    std::cout << is_void<void>::value << std::endl;

    return 0;
}

// This can be used in other Template Classes to check the type of the generic type "T"
template<typename T>
class queue {
public:
    auto push(T const& item) -> void {
        // We can check the generic type "T" here...
        if (is_void<T>::value) {
            // handle case where "T" is a "void" type
        }
    }
private:
    std::vector<T> queue_;
};

/*
 * 2. Explicit Specialisation
*/

/*
 * In the example below, suppose you have a "generic" min() function that works with most types "a" and "b".
 * However, suppose you want a specific case for the min() function if both arguments are std::string.
 * So you create a separate min() function for this case, and this is an example of
 * Explicit Specialisation.
*/
auto min (auto a, auto b) {
    return a < b ? a : b;
}

auto min(std::string a, std::string b) {
    return a.size() < b.size() ? a : b;
}

/*
 * Explicit Specialisation Example
 *
 * Have no "Template" references. The class is implemented for a specific type.
*/
class stack_string {
public:
    /*
     * Within the Class Template, we don't need to put the line: template<typename T>
     * above every function declaration. But if we define the function here, then we need
     * the line.
    */
    auto push(std::string const item) -> void { stack_.push_back(item); }
    auto pop() -> void { stack_.pop_back(); }
    auto top() -> std::string { stack_.back(); }
    auto top() const -> const std::string { stack_.back(); }
    auto empty() const -> bool { stack_.empty(); }
    auto sum() -> int {
        int sum = 0;
        for (auto s : stack_) {
            sum += s.size();
        }
        return sum;
    }
private:
    std::vector<std::string> stack_; // We have std::vector<std::string> instead of just std::vector<T>
};