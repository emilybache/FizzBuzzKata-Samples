package codingdojo;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fizzbuzz3 {

    public static void fizzbuzz() {
        calculateFizzbuzz().forEach(System.out::println);
    }

    static Stream<String> calculateFizzbuzz() {
        return IntStream.range(1, 101).mapToObj(
                Fizzbuzz3::nToFizzbuzz);
    }

    static String nToFizzbuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0)
            return "FizzBuzz";
        else if (n % 3 == 0)
            return "Fizz";
        else if (n % 5 == 0)
            return "Buzz";
        else
            return n + "";
    }
}
