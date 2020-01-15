package codingdojo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Fizzbuzz4 {
    public static void fizzbuzz() {
        new Fizzbuzz4(1, 101).getFizzbuzz().forEach(System.out::println);
    }

    private final int from;
    private final int to;
    private List<String> fizzbuzz;

    Fizzbuzz4() {
        this(1, 101);
    }

    Fizzbuzz4(int from, int to) {
        this.from = from;
        this.to = to;
    }

    List<String> getFizzbuzz() {
        if (fizzbuzz == null) {
            calculateFizzbuzz();
        }
        return this.fizzbuzz;
    }

    private void calculateFizzbuzz() {
        fizzbuzz = IntStream.range(this.from, this.to).mapToObj(this::nToFizzbuzz).collect(Collectors.toList());
    }

    private String nToFizzbuzz(int n) {
        if (n % 15 == 0)
            return "FizzBuzz";
        else if (n % 3 == 0)
            return "Fizz";
        else if (n % 5 == 0)
            return "Buzz";
        else
            return n + "";
    }
}
