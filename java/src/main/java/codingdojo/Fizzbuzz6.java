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

    private final FizzbuzzRange range;
    private List<FizzBuzzFactor> factors;

    public Fizzbuzz6() {
        this(new FizzbuzzRange(1, 101), Arrays.asList(
                new FizzBuzzFactor("Fizz", 3),
                new FizzBuzzFactor("Buzz", 5)
        ));
    }
    public Fizzbuzz6(FizzbuzzRange range, List<FizzBuzzFactor> factors) {
        this.range = range;
        this.factors = factors;
    }

    Stream<FizzbuzzProvider> calculateFizzbuzz() {
        return this.range.stream().map( (n) -> new FizzbuzzCalculator().convert(n, this.factors));
    }

    static class FizzbuzzCalculator {
        public FizzbuzzProvider convert(int n, List<FizzBuzzFactor> factors) {
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
