#include <iostream>

/*
 * Static Members with Templates
 *
 * The general rule is that each template instantiation of a class type has it's own set of
 * static members.
*/

template<typename T>
class stack {
public:
    static int num_stacks_;
};

int main_driver_5_static_members_with_templates() {
    /*
     * In our example here, we will have overall 2 different types of the "num_stacks_" static member.
     * One static member is for the stack<float> type
     * One static member is for the stack<int> type
    */

    stack<float> fs;
    stack<int> is1;
    stack<int> is2;

    return 0;
}
