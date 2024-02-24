/*
 * https://youtu.be/aYNqgIBv6Ak?t=4350
 * lvalue - an expression that is an object reference
 *      • e.g. a variable name, subscript reference
 *      • Always has a defined address in memory
 *
 * rvalue - expression that is not an lvalue
 *      • e.g. object literals, return results of functions
 *      • Generally has NO STORAGE ASSOCIATED WITH IT
*/

/*
 * In C++, a general rule is that everything on the LHS of an "=" sign is always an lvalue,
 * everything on the RHS can be either an lvalue or rvalue
 */
int lvalue_rvalue() {
    /*
     * In the example below, variable "i" refers to an object which has an address in memory.
     * Whereas "5" is something that exists temporarily and doesn't have an address associated with it.
    */
    int i = 5; // 5 is rvalue, i is lvalue
    int j = i; // j is lvalue, i is lvalue
    int k = 4 + i; // 4 + i produces rvalue, then stored in lvalue "k"

    return 0;
}
