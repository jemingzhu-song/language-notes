/*
 * Structs in C++ are exactly the same as Classes, the ONLY difference is that:
 *      • All members (fields, methods, etc.) of a struct are PUBLIC by default
 *      • All members (fields, methods, etc.) of a class are PRIVATE by default
 *
 * We only use structs when we want a simple type with little or no methods and direct access to the data
 * members (as a matter of style)
*/

struct foo {
    foo();

    int age;
};