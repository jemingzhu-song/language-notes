#include <iostream>

int strings() {
    // Reading & Writing Strings from cout & cin
    std::string writeOut = "Enter a string:";
    std::cout << writeOut << std::endl; // "endl" is a NEW LINE character

    std::string readIn;
    std::cin >> readIn;

    std::cout << readIn << " echoed..." << std::endl;

    // String Functions
    std::string sentence = "A quick brown fox jumped over the lazy dog";

    // 1. Length of String
    std::cout << sentence.length() << std::endl;

    // 2. Access Different Elements of String
    std::cout << sentence[5] << std::endl; // c

    // 3. Edit Characters of String
    sentence[0] = 'B';

    // 4. Check if Char or String in String
    // .find(<string>, <position you want to start looking from (this is optional)>)
    std::cout << sentence.find("brown") << std::endl;
    // This will print out "garbage" since it's not in the String
    std::cout << sentence.find("browN", 0) << std::endl;

    // 5. Get Substring
    // .substring(<starting index position>, <length of substring to grab>)
    std::cout << sentence.substr(8, 10) << std::endl;

    return 0;
}