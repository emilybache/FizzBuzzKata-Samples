#include <iostream>
#include <numeric>
#include <algorithm>
#include <sstream>
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
    auto fb5 = new FizzBuzz5();
    for (auto n : numbers) {
        result.push_back(fb5->nToFizzBuzz(n));
    }
    return result;
}

std::string FizzBuzz5::nToFizzBuzz(int n) {
    std::stringstream ss;
    for (auto factor : *factors) {
        if (factor.isAFactor(n)) {
            ss << factor.getName();
        }
    }
    auto result = ss.str();
    return result.empty() ? std::to_string(n) : result;
}


FizzBuzz5::FizzBuzz5() {
    factors = new std::vector<FizzBuzzFactor>();
    auto *fizzFactor = new FizzBuzzFactor("Fizz", 3);
    factors->push_back(*fizzFactor);
    auto *buzzFactor = new FizzBuzzFactor("Buzz", 5);
    factors->push_back(*buzzFactor);
}

bool FizzBuzzFactor::isAFactor(int n) const {
    return n % factor == 0;
}

std::string FizzBuzzFactor::getName() const {
    return name;
}
