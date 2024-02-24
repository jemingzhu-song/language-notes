/*
 * Destructors
 *
 * Destructors are called when the object goes out of scope, and are used when:
 *      • Freeing pointers
 *      • Closing files
 *      • Unlocking mutexes (from multithreading)
 *      • Aborting database transactions
 */
class A {
public:
    A() : a_{2} {
        // body
    }
    // This is a Destructor. "noexcept" means no exception will be thrown
    ~A() noexcept {}

private:
    int a_;
};