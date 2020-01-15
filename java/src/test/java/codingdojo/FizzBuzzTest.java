package codingdojo;

import com.spun.util.StringUtils;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    List<String> FIZZBUZZES_1_TO_100 = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz", "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz", "Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz", "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz", "71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz", "Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz", "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz");


    @Test
    void fizzbuzz1() throws IOException {
        //Redirect System.out to buffer
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bo));
        Fizzbuzz1.fizzbuzz();
        bo.flush();
        String allWrittenLines = new String(bo.toByteArray());
        assertEquals(StringUtils.join(FIZZBUZZES_1_TO_100, "\n") + "\n", allWrittenLines);
    }

    @Test
    void fizzbuzz2(){
        List<String> actual = Fizzbuzz2.calculateFizzbuzz();
        assertEquals(FIZZBUZZES_1_TO_100, actual);
    }

    @Test
    void fizzbuzz3(){
        List<String> actual = Fizzbuzz3.calculateFizzbuzz().collect(Collectors.toList());
        assertEquals(FIZZBUZZES_1_TO_100, actual);
    }

    @Test
    void fizzbuzz4(){
        List<String> actual = new Fizzbuzz4().getFizzbuzz();
        assertEquals(FIZZBUZZES_1_TO_100, actual);
    }

    @Test
    void fizzbuzz5(){
        List<String> actual = Fizzbuzz5.calculateFizzbuzz().collect(Collectors.toList());
        assertEquals(FIZZBUZZES_1_TO_100, actual);
    }

    @Test
    void fizzbuzz6(){
        List<String> actual = new Fizzbuzz6().calculateFizzbuzz().map(Object::toString).collect(Collectors.toList());
        assertEquals(FIZZBUZZES_1_TO_100, actual);
    }
}
