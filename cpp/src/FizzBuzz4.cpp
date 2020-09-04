#include <iostream>
#include <numeric>
#include "FizzBuzz4.h"

void FizzBuzz4::fizzbuzz() {
    for (const std::string& s : calculateFizzBuzz()) {
        std::cout << s << "\n";
    }
}

std::vector<std::string> FizzBuzz4::calculateFizzBuzz() {
    std::vector<int> numbers(_end - _start);
    std::vector<std::string> result;
    std::iota(numbers.begin(), numbers.end(), _start);
    std::transform(numbers.begin(), numbers.end(), std::back_inserter(result), nToFizzBuzz);
    return result;
}

std::string FizzBuzz4::nToFizzBuzz(int n) {
    if (n % 15 == 0)
        return "FizzBuzz";
    else if (n % 3 == 0)
        return "Fizz";
    else if (n % 5 == 0)
        return "Buzz";
    else
        return std::to_string(n);
}