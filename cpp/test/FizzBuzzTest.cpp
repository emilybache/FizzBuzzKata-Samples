#include <src/FizzBuzz1.h>
#include "catch2/catch.hpp"
#include <sstream>
#include <iostream>
#include <src/FizzBuzz2.h>

const std::vector<std::string> FIZZBUZZES_1_TO_100 = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz", "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz", "Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz", "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz", "71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz", "Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz", "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz"};


std::string join(const std::vector<std::string>& vec, const char* delim)
{
    std::stringstream res;
    copy(vec.begin(), vec.end(), std::ostream_iterator<std::string>(res, delim));
    return res.str();
}

TEST_CASE("FizzBuzz1") {
    std::ostringstream oss;
    std::streambuf* p_cout_streambuf = std::cout.rdbuf();
    std::cout.rdbuf(oss.rdbuf());

    fizzbuzz1();

    std::cout.rdbuf(p_cout_streambuf); // restore

    REQUIRE(oss.str() == join(FIZZBUZZES_1_TO_100, "\n"));

}

TEST_CASE("FizzBuzz2") {
    using Catch::Matchers::Equals;
    REQUIRE_THAT(*FizzBuzz2().calculateFizzBuzz(), Equals(FIZZBUZZES_1_TO_100));
}