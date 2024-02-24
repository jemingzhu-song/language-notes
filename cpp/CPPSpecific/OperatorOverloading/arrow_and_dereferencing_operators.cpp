#include <iostream>

class stringptr {
public:
    explicit stringptr(std::string s): ptr_{new std::string(s)} {}

    ~stringptr() {
        delete ptr_;
    }

    std::string* operator->() const {
        return ptr_;
    }

    std::string& operator*() {
        return *ptr_;
    }

private:
    std::string* ptr_;
};

int arrow_and_dereferencing_operators() {
    std::string *s = new std::string("crap pointer");
    delete s;
}