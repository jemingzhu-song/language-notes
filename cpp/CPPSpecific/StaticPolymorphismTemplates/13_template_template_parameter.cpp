#include <iostream>
#include <vector>

/*
 * Template Template Parameters
 *
 * https://youtu.be/f_aE6FobILM?t=4515
 *
 * Template Template Parameters are Template Classes that have two Template Types, one of which
 * is another Template.
*/

/*
 * In the previous topic: 8_templates_multiple_types, we had a "stack" template that took in
 * two template types, one was the type "T", and the other was a container that held the type "T":
*/
template<typename T, typename CONT = std::vector<T>>
class stack {
public:
    stack();
    ~stack();
    auto push(T const& item) -> void;
    auto pop() -> void;
    auto top() -> T&;
    auto top() const -> const T&;
    auto empty() const -> bool;
private:
    CONT stack_;
};

/*
 * Because we have to specify the type "T" twice when we instantiate this template class, e.g:
 *
 *      auto s = stack<float, std::vector<float>>{};
 *
 * This can result in problems if we don't pass the same type "T" in both arguments, e.g:
 *
 *      auto s = stack<int, std::vector<float>>{};
 *
 * Template Template Parameters allow us a way such that if there are two Template Type parameters, we
 * only have to pass in the type "T" once when we instantiate this template, such that:
 *
 *      auto s = stack<int, std::vector>{};
 *
 *      The compiler will know that type T is "int", and the std::vector<int> will be a vector of
 *      "int" types
*/

/*
 * We use template<typename...> typename CONT> because the "..." (spread operator) is needed because
 * the template we pass in (e.g. std::vector) may have more than one template parameter.
*/
template<typename T, template<typename...> typename CONT>
class stack_tt {
public:
    // public functions
private:
    CONT<T> stack_; // Instead of just "CONT", we have "CONT<T>"
};

int main_driver() {
    auto s_tt = stack_tt<int, std::vector>{};

    return 0;
}


