struct random_iter {
    /* Random-Access Iterator Interface/Blueprint */
    /*
    using iterator_category = std::random_access_iterator_tag;
    using value_type = std::pair<int, int>;
    using reference = std::pair<int, int>&;
    using pointer = std::pair<int, int>*;
    using difference_type = int;

    iter(); // must be default constructible.
    ~iter();
    iter(const iter &); // must be copy constructible.
    iter& operator=(const iter &); // must be copy assignable.
    reference operator*() const; // must be dereferenceable and return a reference.
    pointer operator->() const; // only useful if this was an iterator to a class type
    iter &operator++(); // must be pre-incrementable.
    iter operator++(int); // must be post-incrementable.
    iter &operator--(); // must be pre-decrementable.
    iter operator--(int); // must be post-decrementable.
    iter &operator+=(int n); // can progress n spots
    iter &operator-=(int n); // can regress n spots
    reference operator[](int); // get the nth element ahead from this position (setter version).
    reference &operator[](int) const; // get the nth element ahead from this position (getter version).
    friend iter operator+(iter, int n); // new iter n spots ahead
    friend iter operator+(int n, iter); // new iter n spots ahead (reverse order)
    friend iter operator-(iter, int n); // new iter n spots behind
    friend difference_type operator-(iter, iter); // get the distance between two iterators
    friend bool operator<(iter, iter); // all six comparison functions are needed.
    friend bool operator<=(iter, iter); // all six comparison functions are needed.
    friend bool operator>(iter, iter); // all six comparison functions are needed.
    friend bool operator>=(iter, iter); // all six comparison functions are needed.
    friend bool operator==(iter, iter); // all six comparison functions are needed.
    friend bool operator!=(iter, iter); // all six comparison functions are needed.
    */
};
