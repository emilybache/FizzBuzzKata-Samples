#include <src/FizzBuzz.h>
#include "catch2/catch.hpp"

TEST_CASE("FizzBuzz1") {
    REQUIRE(fizzbuzz(1) == "1");
}