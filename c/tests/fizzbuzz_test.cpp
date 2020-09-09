#include <climits>

#include "catch2/catch.hpp"
#include "ApprovalTests.hpp"
#include <string>
#include <stdarg.h>

extern "C"
{
#include "fizzbuzz1.h"
#include "fizzbuzz2.h"
#include "fizzbuzz3.h"
#include "fizzbuzz4.h"
}

static char buffer[1024];
static char *next = buffer;

std::string expected_output = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n16\n17\nFizz\n19\nBuzz\nFizz\n22\n23\nFizz\nBuzz\n26\nFizz\n28\n29\nFizzBuzz\n31\n32\nFizz\n34\nBuzz\nFizz\n37\n38\nFizz\nBuzz\n41\nFizz\n43\n44\nFizzBuzz\n46\n47\nFizz\n49\nBuzz\nFizz\n52\n53\nFizz\nBuzz\n56\nFizz\n58\n59\nFizzBuzz\n61\n62\nFizz\n64\nBuzz\nFizz\n67\n68\nFizz\nBuzz\n71\nFizz\n73\n74\nFizzBuzz\n76\n77\nFizz\n79\nBuzz\nFizz\n82\n83\nFizz\nBuzz\n86\nFizz\n88\n89\nFizzBuzz\n91\n92\nFizz\n94\nBuzz\nFizz\n97\n98\nFizz\nBuzz\n";

TEST_CASE ("fizzbuzz1") {
    fizzbuzz1();
    REQUIRE(std::string(buffer) == expected_output);
    next=buffer; // reset for later.
}

TEST_CASE ("fizzbuzz2") {
    fizzbuzz2();
    REQUIRE(std::string(buffer) == expected_output);
    next=buffer; // reset for later.
}

TEST_CASE ("fizzbuzz3") {
    fizzbuzz3();
    REQUIRE(std::string(buffer) == expected_output);
    next=buffer; // reset for later.
}

TEST_CASE ("fizzbuzz4") {
    fizzbuzz4();
    REQUIRE(std::string(buffer) == expected_output);
    next=buffer; // reset for later.
}
// trick to capture output sent to printf
int printf(const char *fmt, ...) {
    va_list argp;
    va_start(argp, fmt);
    const int ret = vsnprintf(next, sizeof buffer-(next-buffer), fmt, argp);
    next += ret;
    va_end(argp);
    return ret;
}