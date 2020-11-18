package codingdojo;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Fizzbuzz5 {
    companion object {
        fun fizzbuzz() {
            calculateFizzbuzz().forEach(System.out::println);
        }

        fun calculateFizzbuzz(): List<String> {
            return (1..100).map { n -> fizzbuzzFactor(n) }
        }

        fun fizzbuzzFactor(n: Int): String {
            val result = StringBuilder();
            for (factor in factors) {
                if (factor.predicate(n)) {
                    result.append(factor.name);
                }
            }
            val fizzbuzz = result.toString();
            if ("".equals(fizzbuzz))
                return "$n"
            else
                return fizzbuzz
        }

        val factors: List<Factor> = listOf(Factor("Fizz", 3), Factor("Buzz", 5));
    }

    class Factor(val name: String, val factor: Int) {
        val predicate = { n: Int -> n % factor == 0 }
    }

}

