#include <iostream>
#include <tuple>

int tuples() {

    // 0. Initialising Tuples
    std::tuple<int, std::string, char> marks = {2, "Michael", 'C'};
    std::tuple<int, std::string> person(20, "Timothy");
    std::tuple<int, bool> stuff;
    stuff = std::make_tuple(92, false); // Use the std::make_tuple() constructor

    // 1. Get Tuple Elements
    // get<index>(tupleName) will get the element at the "index" specified
    std::cout << std::get<2>(marks) << std::endl; // 'C'
    std::cout << std::get<0>(stuff) << std::endl; // 92
    // We can also get elements from a tuple by the data type
    std::cout << std::get<bool>(stuff) << std::endl;

    // 2. Swap Two Tuples
    std::tuple<int, int> t1 = {1, 2};
    std::tuple<int, int> t2 = {9, 8};
    t2.swap(t1);
    std::cout << std::get<0>(t1) << std::endl;
    std::cout << std::get<1>(t1) << std::endl;
    std::cout << std::get<0>(t2) << std::endl;
    std::cout << std::get<1>(t2) << std::endl;

    // 3. Decompose Tuples using .tie()
    std::tuple<int, std::string> t3 = {2, "Hello World"};
    int x;
    std::string y;
    tie(x, y) = t3;
    std::cout << x << std::endl;
    std::cout << y << std::endl;

    // 4. Combining/Concatenating Tuples using tuple_cat(tuple1, tuple2)
    std::tuple<int, std::string> t4 = {2, "Banana"};
    std::tuple<bool, int> t5 = {false, 323};

    auto result = std::tuple_cat(t4, t5);
    std::cout << std::get<0>(result) << std::endl;
    std::cout << std::get<1>(result) << std::endl;
    std::cout << std::get<2>(result) << std::endl;
    std::cout << std::get<3>(result) << std::endl;

    return 0;
}
