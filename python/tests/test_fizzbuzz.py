import io
import sys

import pytest

import fizzbuzz1, fizzbuzz2, fizzbuzz3, fizzbuzz4, fizzbuzz5, fizzbuzz6

FIZZBUZZES_1_TO_100 = ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz", "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz", "Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz", "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz", "71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz", "Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz", "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz"]


def get_fizzbuzz(fb_fn):
    orig_sysout = sys.stdout
    try:
        fake_stdout = io.StringIO()
        sys.stdout = fake_stdout
        fb_fn()
        answer = fake_stdout.getvalue()
        assert str("\n".join(FIZZBUZZES_1_TO_100)).strip() == answer.strip()
    finally:
        sys.stdout = orig_sysout


def test_fizzbuzz1():
    get_fizzbuzz(fizzbuzz1.fizzbuzz1)


def test_fizzbuzz2():
    get_fizzbuzz(fizzbuzz2.fizzbuzz2)


def test_fizzbuzz3():
    get_fizzbuzz(fizzbuzz3.fizzbuzz3)


def test_fizzbuzz4():
    get_fizzbuzz(fizzbuzz4.fizzbuzz4)


def test_fizzbuzz5():
    get_fizzbuzz(fizzbuzz5.fizzbuzz5)

def test_fizzbuzz6():
    get_fizzbuzz(fizzbuzz6.fizzbuzz6)

