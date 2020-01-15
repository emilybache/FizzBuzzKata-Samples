package codingdojo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fizzbuzz5 {

    public static void fizzbuzz() {
        calculateFizzbuzz().forEach(System.out::println);
    }

    static Stream<String> calculateFizzbuzz() {
        return IntStream.range(1, 101).mapToObj(Fizzbuzz5::fizzbuzzFactor);
    }

    static String fizzbuzzFactor(int n) {
        StringBuilder result = new StringBuilder();
        for (FizzBuzzFactor factor : factors) {
            if (factor.predicate.test(n)) {
                result.append(factor.name);
            }
        }
        String fizzbuzz = result.toString();
        return "".equals(fizzbuzz) ? "" + n : fizzbuzz;
    }

    private static List<FizzBuzzFactor> factors = Arrays.asList(
            new Fizzbuzz5.FizzBuzzFactor("Fizz", 3),
            new Fizzbuzz5.FizzBuzzFactor("Buzz", 5)
    );

    static class FizzBuzzFactor {
        public String name;
        public Predicate<Integer> predicate;
        public FizzBuzzFactor(String name, int factor) {
            this.name = name;
            this.predicate = n -> n % factor == 0;
        }

    }

}

