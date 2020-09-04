#include <iostream>
#include <numeric>
#include "FizzBuzz5.h"

void FizzBuzz5::fizzbuzz() {
    for (const std::string& s : calculateFizzBuzz()) {
        std::cout << s << "\n";
    }
}

std::vector<std::string> FizzBuzz5::calculateFizzBuzz() {
    std::vector<int> numbers(100);
    std::vector<std::string> result;
    std::iota(numbers.begin(), numbers.end(), 1);
    std::transform(numbers.begin(), numbers.end(), std::back_inserter(result), nToFizzBuzz);
    return result;
}

std::string FizzBuzz5::nToFizzBuzz(int n) {
    if (n % 3 == 0 && n % 5 == 0)
        return "FizzBuzz";
    else if (n % 3 == 0)
        return "Fizz";
    else if (n % 5 == 0)
        return "Buzz";
    else
        return std::to_string(n);
}