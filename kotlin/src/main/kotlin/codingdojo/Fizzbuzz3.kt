package codingdojo;

class Fizzbuzz3 {
    companion object {
        fun fizzbuzz() {
            calculateFizzbuzz().forEach(System.out::println);
        }

        fun calculateFizzbuzz(): List<String> {
            return (1..100).map { i -> Fizzbuzz3.nToFizzbuzz(i) };
        }

        fun nToFizzbuzz(n: Int): String {
            if (n % 3 == 0 && n % 5 == 0)
                return "FizzBuzz";
            else if (n % 3 == 0)
                return "Fizz";
            else if (n % 5 == 0)
                return "Buzz";
            else
                return "$n";
        }
    }
}
