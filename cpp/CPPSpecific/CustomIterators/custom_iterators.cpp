#include <iostream>
#include <vector>

/*
 * Iterator Traits
 *
 * Each iterator has certain properties
 *      1. Category (input, output, forward, bidirectional, random-access) - e.g. If "forward" Category, the iterator
 *         can only move forwards, and can't be decremented. Therefore, you only need to define the "++" and "+=" operator
 *         overloads, and not the "--" and "-=" operator overloads. If it is in "bidirectional" Category, you'd have to
 *         define both.
 *      2. Value-Type (T) - What data type our Container (that we are defining this Custom Iterator for) is storing
 *      3. Reference Type (T& or const T&) - The reference to the data type stored in our Container
 *      4. Pointer Type (T* or T* const) - not strictly required - The pointer to the data type stored in our Container
 *      5. Difference Type - type used to count how far it is between iterators (Difference Type is usually "int" or
 *      "std::pointerdiff_t" or "std::ptrdiff_t")
 *
 * When writing your own custom iterator, you need to tell the compiler what each of these are
*/

// An example of a "Generic" Iterator Class that models an int*
// <iterator> contains the category tags
#include <iterator>
class iter {
public:
    using iterator_category
            = std::contiguous_iterator_tag;
    using value_type = int;
    using reference_type = value_type&;
    using pointer_type = value_type*; // could also do pointer_type = void;
    using difference_type = std::ptrdiff_t; // usually std::pointerdiff_t is sufficient or even "int" is sufficient
};

/* Container Requirements for Custom Iterator */
/*
 * Usually, the convention is to define the iterator class "nested inside" the class you want the iterator
 * to apply to. So essentially an Iterator Class is a "nested class".
 *
 * When defining a Custom Iterator for a Container, we usually want the Container to allow for std::[cr]begin and
 * std::[cr]end iterators as well. To do this, we need to define the following in the Container class (not in the Iterator
 * class) since we need to pass it into the Custom Iterator class.
 *      • begin() method
 *      • end() method
 *      • cbegin() method
 *      • cend() method
 *      • rbegin() method - if iterator is bidirectional
 *      • rend() method - if iterator is bidirectional
 * By convention, we also need to define a type Container::[const_]iterator
 */
// DEMO: https://youtu.be/mrlaAUcxQFA?t=2995
#include <algorithm>
#include <iterator>
#include <memory>
#include <utility>

// "IntStack" is our Container
// IntStack is basically a "Stack" where the elements are "Nodes" which just hold "int" values
class IntStack {
private:
    struct Node {
        Node(int value, std::unique_ptr<Node>&& next) : value{value}, next{std::move(next)} {}
        int value;
        std::unique_ptr<Node> next;
    };

    // The "Iterator" is our Custom Iterator Class, which is nested inside of our Container Class (the "IntStack" class)
    class Iterator {
        friend IntStack;
    public:
        // Our 5 Iterator Properties we must define
        using iterator_category = std::forward_iterator_tag;
        using value_type = int; // Since "Node" just holds an "int" value
        using reference = int&;
        using pointer = int*;
        using difference_type = int;

        reference operator*() const {
            return node_->value;
        }

        pointer operator->() const {
            return &(operator*());
        }

        // !!!!!!!!!!!!!!!!!!IMPORTANT!!!!!!!!!!!!!!!!!!
        // You need the & for the ++ and the -- operator
        Iterator &operator++() {
            node_ = node_->next.get();
            return *this;
        }

        Iterator operator++(int) {
            auto copy{*this};
            ++(*this);
            return copy;
        }

        friend bool operator==(const Iterator& lhs, const Iterator& rhs) {
            return lhs.node_ == rhs.node_;
        }

        friend bool operator!=(const Iterator& lhs, const Iterator& rhs) {
            return !(lhs == rhs);
        }

    private:
        // We make the Iterator class's constructor PRIVATE because we don't want people to construct their
        // own iterator outside of the Container class. This is because we can still access this Iterator class from
        // outside, by doing: IntStack::Iterator. So we don't want people to use the constructor by doing something like:
        // IntStack::Iterator(node_name_example).
        explicit Iterator(Node *node) : node_{node} {};
        Node *node_; // This "Iterator" points to a "Node"
    };

public:
    // We are defining the custom "Iterator" for this "IntStack" Container Class
    using iterator = Iterator;
    using const_iterator = Iterator;

    iterator begin() {
        return iterator{head_.get()};
    }

    const_iterator begin() const {
        return cbegin();
    }

    const_iterator cbegin() const {
        return const_iterator{head_.get()};
    }

    iterator end() {
        return iterator(nullptr);
    }

    const_iterator end() const {
        return cend();
    }

    const_iterator cend() const {
        return const_iterator{nullptr};
    }

    void push(int value) {
        head_ = std::make_unique<Node>(value, std::move(head_));
    }

    void pop() {
        head_ = std::move(head_->next);
    }

    const int& top() const {
        return *cbegin();
    }

    int& top() {
        return *begin();
    }

private:
    std::unique_ptr<Node> head_;
};

int custom_iterators() {
    IntStack marks = IntStack();
    marks.push(2);
    marks.push(99);
    marks.push(45);
    marks.push(100);
    marks.push(8);

    auto begin = marks.begin();
    std::cout << *begin << std::endl;

    std::cout << "Looping..." << std::endl;
    for (auto i = marks.begin(); i != marks.end(); i++) {
        std::cout << *i << std::endl;
    }
}