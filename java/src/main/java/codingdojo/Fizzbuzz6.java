package codingdojo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fizzbuzz6 {
    public static void fizzbuzz() {
        new Fizzbuzz6().calculateFizzbuzz().forEach(System.out::println);
    }

    private static List<FizzBuzzFactor> factors = Arrays.asList(
            new FizzBuzzFactor("Fizz", 3),
            new FizzBuzzFactor("Buzz", 5)
    );
    private final FizzbuzzRange range;

    public Fizzbuzz6() {
        this.range = new FizzbuzzRange(1, 101);
    }

    Stream<FizzbuzzProvider> calculateFizzbuzz() {
        return this.range.stream().map( (n) -> new FizzbuzzCalculator().convert(n));
    }

    static class FizzbuzzCalculator {
        public FizzbuzzProvider convert(int n) {
            StringBuilder result = new StringBuilder();
            for (Fizzbuzz6.FizzBuzzFactor factor : factors) {
                if (factor.predicate.test(n)) {
                    result.append(factor.name);
                }
            }
            return new FizzbuzzProvider(result.toString(), n);
        }
    }

    static class FizzbuzzProvider {
        private int n;
        private String provided;

        public  FizzbuzzProvider(String provided, int n) {
            this.provided = provided;
            this.n = n;
        }
        public String provide() {
            return "".equals(provided) ? "" + this.n : provided;
        }
        @Override
        public String toString() {
            return provide();
        }
    }

    static class FizzbuzzRange {

        private final int from;
        private final int to;

        public FizzbuzzRange(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public Stream<Integer> stream() {
            return IntStream.range(this.from, this.to).boxed();
        }
    }

    static class FizzBuzzFactor {
        public String name;
        public Predicate<Integer> predicate;
        public FizzBuzzFactor(String name, int factor) {
            this.name = name;
            this.predicate = n -> n % factor == 0;
        }

    }
}
