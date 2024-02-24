/*
 * Exception Safety Levels
 *
 * Operations performed have various levels of safety:
 *      • No-throw (failure transparency)
 *      • Strong exception safety (commit-or-rollback)
 *      • Weak exception safety (no leak)
 *      • No exception safety
*/

/* "noexcept" specifier */
/*
 * Specifies whether a function could potentially throw
 * Using "noexcept" is basically specifying that a function is a "no-throw guarantee", however it doesn't
 * actually stop an exception from being thrown. It's essentially used to indicate to other engineers
 * that there is no need to put a try/catch block in this function.
 *
 * Generally, we want to put "noexcept" for every function that we are sure no exceptions will be thrown
*/
class S {
public:
    int foo() const noexcept;
};

/* No-throw guarantee */
/*
 * • Also known as failure transparency
 * • Operations are !!!GUARANTEED TO SUCCEED!!!, !!!even in exception!!!
 *      • Exceptions may occur, but are handled internally
 * • No exceptions are visible to the client
 * • This is the same, for all intents and purposes, as noexcept in C++
 * • Examples:
 *      • Closing a file
 *      • Freeing memory
 *      • Anything done in constructors or moves (usually)
 *      • Creating a trivial object on the stack (made up of only ints)
*/

/* Strong exception safety */
/*
 * • Also known as "commit or rollback" semantics
 * • Operations can fail, but the failed operations are guaranteed to have no visible effects - i.e.
 *   the failed operations will be as if you never called them at all.
 * • Probably the most common level of exception safety for types in C++
 * • All your copy-constructors should generally follow these semantics
 *
 * To achieve strong exception safety, you need to:
 *      • First perform any operations that may throw, but don't do anything irreversible
 *      • Then perform any operations that are irreversible, but don't throw
 */

/* Basic (Weak) exception safety */
/*
 * This is known as the no-leak guarantee
 * • Partial execution of failed operations can cause side effects, but:
 *      • All invariants must be preserved
 *      • No resources are LEAKED
 * • Any stored data will contain valid values, even if it was different now from before the exception
 *      • A "valid, but unspecified state"
 *      • Move constructors that are not noexcept follow these semantics
*/

/* No exception safety */
/*
 * • No guarantees
 * • Don't write C++ with no exception safety
 *      • Very hard to debug when things go wrong
 *      • Very easy to fix - wrap your resources and attach lifetimes. This gives you basic exception
 *        safety for free
*/