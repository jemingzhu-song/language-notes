#include <iostream>
#include <queue>

int queues() {

    std::queue<std::string> names;

    // 1. Add to Queue (add to back of queue)
    names.push("Michael");
    names.push("Zion");
    names.push("Adam");
    names.push("Xavier");
    names.push("Brian");

    // 2. Get Front of Queue: .front()
    std::cout << names.front() << std::endl;

    // 3. Get Back of Queue: .back()
    std::cout << names.back() << std::endl;

    // 4. Remove from Queue (remove from front of queue)
    // .pop() doesn't return anything, so to check what has been popped you need to use .front() before it is popped
    std::cout << names.front() << std::endl;
    names.pop();
    std::cout << names.front() << std::endl;
    names.pop();
    std::cout << names.front() << std::endl;
    names.pop();
    std::cout << names.front() << std::endl;
    names.pop();
    std::cout << names.front() << std::endl;
    names.pop();

    // 5. Check if Queue is Empty
    std::cout << names.empty() << std::endl;

    // 6. Size of Queue
    std::cout << names.size() << std::endl;

    return 0;
}
