package codingdojo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fizzbuzz6 {
    public static void fizzbuzz() {
        Fizzbuzz6 fizzbuzz6 = new Fizzbuzz6();
        fizzbuzz6.calculateFizzbuzz()
                .forEach(System.out::println);
    }

    private final Range range;
    private List<Factor> factors;

    public Fizzbuzz6() {
        this(new Range(1, 101), Arrays.asList(
                new Factor("Fizz", 3),
                new Factor("Buzz", 5)
        ));
    }

    public Fizzbuzz6(Range range, List<Factor> factors) {
        this.range = range;
        this.factors = factors;
    }

    Stream<Provider> calculateFizzbuzz() {
        FizzbuzzCalculator calculator =
                new FizzbuzzCalculator(this.factors);
        return this.range.stream().map(calculator::convert);
    }

    static class FizzbuzzCalculator {
        private final List<Factor> factors;

        FizzbuzzCalculator(List<Factor> factors) {
            this.factors = factors;
        }

        public Provider convert(int n) {
            StringBuilder result = new StringBuilder();
            for (Factor factor : factors) {
                if (factor.predicate.test(n)) {
                    result.append(factor.name);
                }
            }
            return new Provider(result.toString(), n);
        }
    }

    static class Provider {
        private int n;
        private String provided;

        public Provider(String provided, int n) {
            this.provided = provided;
            this.n = n;
        }

        public String provide() {
            if ("".equals(provided))
                return "" + this.n;
            return provided;
        }

        @Override
        public String toString() {
            return provide();
        }
    }

    static class Range {

        private final int from;
        private final int to;

        public Range(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public Stream<Integer> stream() {
            return IntStream.range(this.from, this.to).boxed();
        }
    }

    static class Factor {
        public String name;
        public Predicate<Integer> predicate;

        public Factor(String name, int factor) {
            this.name = name;
            this.predicate = n -> n % factor == 0;
        }

    }
}
