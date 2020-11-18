package codingdojo;

import java.util.ArrayList;

class Fizzbuzz2 {
    companion object {

        fun fizzbuzz() {
            calculateFizzbuzz().forEach(System.out::println);
        }

        fun calculateFizzbuzz(): ArrayList<String>
        {
            val result = ArrayList <String>();
            for (n in 1..100) {
            if (n % 3 == 0 && n % 5 == 0)
                result.add("FizzBuzz");
            else if (n % 3 == 0)
                result.add("Fizz");
            else if (n % 5 == 0)
                result.add("Buzz");
            else
                result.add("$n");
        }
            return result;
        }
    }
}
