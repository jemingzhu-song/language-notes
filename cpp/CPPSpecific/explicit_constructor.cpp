/*
 * If a constructor for a class is callable with a SINGLE parameter, the compiler
 * will create an implicit type conversion from the parameter to the class type.
 *
 * This may be the behaviour you want, but probably not.
 *
 * You have to opt out of this implicit type conversion with the "explicit" keyword
 *
*/

class point2d {
public:
    // Use "explicit" keyword here because it is a constructor with a SINGLE parameter. If you add
    // the "explicit" keyword, the following code at the bottom won't work:
    //      point2d example = 2.0f;
    point2d(float n) : x_{n}, y_{n} {}

private:
    float x_;
    float y_;
};

int explicit_constructor() {
    point2d example = 2.0f;
}
