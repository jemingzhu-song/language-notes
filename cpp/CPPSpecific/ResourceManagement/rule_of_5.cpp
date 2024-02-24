#include <algorithm>
/*
 * When writing a class, if we can't default all of our operators (preferred), we should
 * consider the "Rule of 5"
 *
 *      1. Destructor
 *      2. Copy Constructor
 *      3. Copy Assignment
 *      4. Move Assignment
 *      5. Move Constructor
 *
 * Although these are "Synthesised", even if you already define a constructor, you will need to
 * "customise" them if you use Heap Resources in your class.
 *
 * If you define one of the rule of 5, you should explicilty delete, default, or define ALL FIVE.
 *      - If the default behaviour isn't sufficient for one of them, it is likely that it isn't
 *      sufficient for all others
*/

/*
 * std::vector<int> under the hood
 *
 * Let's see how a vector is implemented. It's going to have to manage some form of heap memory, which
 * is handled by the class destructor.
*/

class my_vec {
public:
    my_vec(int size) : data_{new int[size]}, size_{size}, capacity_{size} {}
    /*
     * 1. Destructor
     *
     * The class destructor calls the destructor on each of the member
     * variables. However, since our "data_" member variable is a Heap Resource, we must explicitly
     * "delete" it in the destructor, otherwise the memory isn't actually freed.
     */
    ~my_vec() {
        delete[] data_; // Explicitly delete the Heap Memory associated with "new int[size]"
    };

    /*
     * 2. Copy Constructor
     * https://youtu.be/aYNqgIBv6Ak?t=3478
     *
     * The problem with the Copy Constructor is we can't do: data_{orig.data_} because orig.data_ points
     * to a Heap Memory. If we just copy it like this, the "new" data_ will also point to the same
     * Heap Memory.
     *
     * To solve this, we need to allocate NEW HEAP MEMORY by doing: data_{new int[orig.size_]}.
     * We also need to copy the actual data that the pointer is pointing to.
     *
     * To call/invoke a Copy Constructor:
     *      auto vec_short = my_vec(2);
     *      auto vec_short2 = vec_short;
     *
     *      or
     *
     *      auto vec_short = my_vec(2);
     *      auto vec_short2 = my_vec(vec_short);
    */
    my_vec(my_vec const& orig): data_{new int[orig.size_]}, size_{orig.size_}, capacity_{orig.capacity_} {
        // Copies the actual data that the orig.data_ pointer was pointing to
        std::copy(orig.data_, orig.data_ + orig.size_, data_);
    }

    /*
     * 3. Copy Assignment
     * https://youtu.be/aYNqgIBv6Ak?t=4046
     *
     * Copy Assignment is the same as Copy Construction, except that there is already a constructed
     * object in your destination.
     *
     * You must clean up the destination first. The "copy-and-swap" idiom makes this trivial.
     *
     * To call/invoke a Copy Assignment, make sure to first declare both objects to be copied and to,
     * for example:
     *
     * auto vec_short = my_vec(2); // To be copied
     * auto vec_long = my_vec(9); // To be copied to
     * vec_long = vec_short;
    */
    my_vec& operator=(my_vec const& orig) {
        my_vec copy = orig;
        std::swap(copy, *this);
        return *this;
    }

    /*
     * 4. Move Constructor
     * https://youtu.be/aYNqgIBv6Ak?t=5225
     *
     * Always declare your moves as noexcept. Failing to do so can make your code slower.
     * Unless otherwise specified, objects that have been moved from should always be in a valid but
     * unspecified state. i.e. If you move data from object 1 to object 2, after the move, object 1
     * should have valid data that is in an unspecified/default state.
     *
     * To call/invoke a Move Constructor, wrap the object to be moved from in a std::move(), for example:
     *      auto mv3 = my_vec(std::move(mv));
    */
    my_vec(my_vec&& orig) noexcept
    : data_{std::exchange(orig.data_, nullptr)}
    , size_{std::exchange(orig.size_, 0)}
    , capacity_{std::exchange(orig.capacity_, 0)} {};

    /*
     * 5. Move Assignment
     * https://youtu.be/aYNqgIBv6Ak?t=5825
     *
     * To call/invoke the Move Assignment, make sure to first declare both the objects to be moved to
     * and from, then use the std::move(<object>), for example:
     *
     * auto vec_short = my_vec{2}; // Define object to be moved from
     * auto vec_long = my_vec{9}; // Define object to be moved to
     * vec_long = std::move(vec_short) // Move Assignment Invoked
    */
    my_vec& operator=(my_vec&& orig) noexcept {
        std::swap(data_, orig.data_);
        std::swap(size_, orig.size_);
        std::swap(capacity_, orig.capacity_);

        delete[] orig.data_;
        orig.data_ = nullptr;
        orig.size_ = 0;
        orig.capacity_ = 0;

        return *this;
    }

    int* data_;
    int size_;
    int capacity_;
};