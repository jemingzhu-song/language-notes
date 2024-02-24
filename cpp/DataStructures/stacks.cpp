#include <iostream>
#include <stack>

int stacks() {
    std::stack<std::string> names;

    // 1. Push to Stack
    names.push("Michael");
    names.push("Adam");
    names.push("Brian");
    names.push("Zion");
    names.push("Xavier");

    // 2. Get Top of Stack: .top()
    std::cout << names.top() << std::endl;

    // 3. Pop from Stack
    // .pop() doesn't return anything, so to check what has been popped you need to use .top() before it is popped
    std::cout << names.top() << std::endl;
    names.pop();
    std::cout << names.top() << std::endl;
    names.pop();
    std::cout << names.top() << std::endl;
    names.pop();
    std::cout << names.top() << std::endl;
    names.pop();
    std::cout << names.top() << std::endl;
    names.pop();

    // 4. Check if Stack is Empty
    std::cout << names.empty() << std::endl;

    // 5. Size of Stack
    std::cout << names.size() << std::endl;

    return 0;
}