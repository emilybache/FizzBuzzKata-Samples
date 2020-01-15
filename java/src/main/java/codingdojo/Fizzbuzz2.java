package codingdojo;

import java.util.ArrayList;
import java.util.List;

public class Fizzbuzz2 {

    public static void fizzbuzz() {
        calculateFizzbuzz().forEach(System.out::println);
    }

    static List<String> calculateFizzbuzz() {
        var result = new ArrayList<String>();
        for (int n = 1; n < 101; n++) {
            if (n % 3 == 0 && n % 5 == 0)
                result.add("FizzBuzz");
            else if (n % 3 == 0)
                result.add("Fizz");
            else if (n % 5 == 0)
                result.add("Buzz");
            else
                result.add(n + "");
        }
        return result;
    }
}
