/*
 * https://youtu.be/8-_DsvZm464?t=1429
 * A class may declare another function or class as a friend.
 * Friends are basically "static" functions, which can access the private members of the class where
 * the friend function is defined in. In the example below, since the "dist()" function is declared as
 * a "friend function" inside the "point2d" class itself, it can access the private members of the
 * class parameters that are passed into the friend function.
 * For a class C and a friend F:
 *      • F is not a friend of the children of C.
 *      • F is not a friend of classes that C is a friend of.
 *      • F is not a friend of any parent classes of C
 *
 * Friends are always public. Ideally, we define "friend" functions inside a ".h" file.
 */

class point2d {
public:
    friend float dist(point2d &p1, point2d &p2);

private:
    float x_;
    float y_;
};

float dist(point2d &p1, point2d &p2) {
    return p1.x_ + p2.x_ + p1.y_ + p2.y_;
}
