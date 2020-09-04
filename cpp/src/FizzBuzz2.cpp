#include <vector>
#include <iostream>
#include "FizzBuzz2.h"

void FizzBuzz2::fizzbuzz2() {
    for (const std::string& s : *calculateFizzBuzz()) {
        std::cout << s << "\n";
    }
}

std::vector<std::string>* FizzBuzz2::calculateFizzBuzz() {
    auto result = new std::vector<std::string>();
    for (int n = 1; n < 101; n++) {
        if (n % 3 == 0 && n % 5 == 0)
            result->emplace_back("FizzBuzz");
        else if (n % 3 == 0)
            result->emplace_back("Fizz");
        else if (n % 5 == 0)
            result->emplace_back("Buzz");
        else
            result->push_back(std::to_string(n));
    }
    return result;
}
