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
        IntStream range = IntStream.range(1, 101);
        return range.mapToObj(Fizzbuzz5::fizzbuzzFactor);
    }

    static String fizzbuzzFactor(int n) {
        StringBuilder result = new StringBuilder();
        for (Factor factor : factors) {
            if (factor.predicate.test(n)) {
                result.append(factor.name);
            }
        }
        String fizzbuzz = result.toString();
        return "".equals(fizzbuzz) ? "" + n : fizzbuzz;
    }

    private static List<Factor> factors = Arrays.asList(
            new Factor("Fizz", 3),
            new Factor("Buzz", 5)
    );

    static class Factor {
        public String name;
        public Predicate<Integer> predicate;
        public Factor(String name, int factor) {
            this.name = name;
            this.predicate = n -> n % factor == 0;
        }

    }

}

