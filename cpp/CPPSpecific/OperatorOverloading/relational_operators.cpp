class point {
public:
    point(int x, int y): x_{x}, y_{y} {};

    // Using Operator Overloading
    friend bool operator==(point &p1, point &p2) {
        return p1.x_ == p2.x_ && p1.y_ == p2.y_;
    }

    friend bool operator!=(point &p1, point &p2) {
        return !(p1 == p2);
    }

    friend bool operator<(point &p1, point &p2) {
        return p1.x_ < p2.x_ && p1.y_ < p2.y_;
    }

    friend bool operator>(point &p1, point &p2) {
        return p1.x_ > p2.x_ && p1.y_ > p2.y_;
    }

    // Member Operator Overloading
    point& operator=(point &p1);

private:
    int x_;
    int y_;
};

point& point::operator=(point &p1) {
    x_ = p1.x_;
    y_ = p1.y_;
    return *this;
}
