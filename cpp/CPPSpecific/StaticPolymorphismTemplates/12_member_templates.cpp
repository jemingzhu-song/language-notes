/*
 * Member Templates
 *
 * https://youtu.be/f_aE6FobILM?t=3960
 *
 * • Member Templates are basically functions or member functions of a class that deal with other templates
*/
template<typename T>
class stack {
public:
    stack();
    /*
     * The below is an example of a Member Template, which is a Copy Constructor that takes in a "stack"
     * of a different type, "T2", and creates a new "stack" of type "T"
    */
    template<typename T2>
    stack(stack<T2>&);
    ~stack();
    auto push(T const& item) -> void;
    auto pop() -> void;
    auto top() -> T&;
    auto top() const -> const T&;
    auto empty() const -> bool;
private:
    T stack_;
};

/*
 * To implement this Member Template (Copy Constructor), we need to specify both the typename T and
 * typename T2.
*/
template<typename T>
template<typename T2>
stack<T>::stack(stack<T2> &s) {
    while (!s.empty()) {
        stack_.push_back(static_cast<T>(s.pop()));
    }
}