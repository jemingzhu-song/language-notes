#include <iostream>
#include <fstream>

int file_input_output() {
    auto fout = std::ofstream{"data.out"};
    // Below line only works C++17
    if (auto in = std::ifstream{"data.in"}; in) { // attempts to open file, checks it was opened
        for (auto i = 0; in >> i;) { // reads in
            std::cout << i << std::endl;
            fout << i;
        }
        if (in.bad()) {
            std::cerr << "unrecoverable error (e.g. disk disconnected?)\n";
        } else if (not in.eof()) {
            std::cerr << "bad input: didn't read an int\n";
        } // closes file automatically <-- no need to close manually!
    }
    else {
        std::cerr << "unable to read data.in\n";
    }

    return 0;
}