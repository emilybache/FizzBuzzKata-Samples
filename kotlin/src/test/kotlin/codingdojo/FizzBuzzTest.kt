package codingdojo;

import org.junit.Test
import kotlin.test.assertEquals

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class FizzBuzzTest {

    val FIZZBUZZES_1_TO_100 = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz", "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz", "Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz", "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz", "71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz", "Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz", "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz");

    @Test
    fun fizzbuzz1() {
        //Redirect System.out to buffer
        var bo = ByteArrayOutputStream();
        System.setOut(PrintStream(bo));
        Fizzbuzz1.fizzbuzz();
        bo.flush();
        val allWrittenLines = String(bo.toByteArray());
        val expected = FIZZBUZZES_1_TO_100.joinToString(separator = "\n") { e -> e }
        assertEquals("$expected\n", allWrittenLines);
    }

    @Test
    fun fizzbuzz2() {
        val actual = Fizzbuzz2.calculateFizzbuzz();
        assertEquals(FIZZBUZZES_1_TO_100, actual);
    }

    @Test
    fun fizzbuzz3() {
        val actual = Fizzbuzz3.calculateFizzbuzz()
        assertEquals(FIZZBUZZES_1_TO_100, actual);
    }

    @Test
    fun fizzbuzz4() {
        val actual = Fizzbuzz4().calculateFizzbuzz()
        assertEquals(FIZZBUZZES_1_TO_100, actual);
    }

    @Test
    fun fizzbuzz5() {
        val actual = Fizzbuzz5.calculateFizzbuzz()
        assertEquals(FIZZBUZZES_1_TO_100, actual);
    }

    @Test
    fun fizzbuzz6() {
        val actual = Fizzbuzz6().calculateFizzbuzz().map { i -> i.toString() }
        assertEquals(FIZZBUZZES_1_TO_100, actual);
    }
}
