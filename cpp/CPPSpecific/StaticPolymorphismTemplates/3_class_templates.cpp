#include <iostream>
#include <vector>

/*
 * Templated Classes work similar to how we implement Function Templates
*/
template<typename T>
class stack {
public:
    /*
     * Within the Class Template, we don't need to put the line: template<typename T>
     * above every function declaration. But if we define the function here, then we need
     * the line.
    */
    auto push(T const& item) -> void;
    auto pop() -> void;
    auto top() -> T&;
    auto top() const -> const T&;
    auto empty() const -> bool;
private:
    // We have a vector of "T"
    std::vector<T> stack_;
};

/*
 * We need to put: "template<typename T>" above every member function implementation. This
 * gives it "context" in the sense of "T"
*/
template<typename T>
auto stack<T>::push(T const& item) -> void {
    stack_.push_back(item);
}

template<typename T>
auto stack<T>::pop() -> void {
    stack_.pop_back();
}

template<typename T>
auto stack<T>::top() -> T& {
    return stack_.back();
}

/*
 * Class Templates - Rule of "5":
 *      1. Destructor
 *      2. Copy Constructor
 *      3. Copy Assignment
 *      4. Move Assignment
 *      5. Move Constructor
*/
template<typename T>
class queue {
public:
    ~queue();
    queue(const queue<T> &q);
    queue(const queue<T> &&q);
    queue<T>& operator=(const queue<T> &q);
    queue<T>& operator=(queue<T> &&q);
private:
    std::vector<T> queue_;
};

// 1. Destructor
template<typename T>
queue<T>::~queue() {};

// 2. Copy Constructor
template<typename T>
queue<T>::queue(const queue<T> &q) : queue_{q.queue_} {};

// 3. Copy Assignment
template<typename T>
queue<T>& queue<T>::operator=(const queue<T> &q) {
    queue_ = q.queue_;
}

// 4. Move Constructor
template<typename T>
queue<T>::queue(const queue<T> &&q) : queue_{std::move(q.queue_)} {}

// 5. Move Assignment
template<typename T>
queue<T>& queue<T>::operator=(queue<T> &&q) {
    queue_ = std::move(q.queue_);
}