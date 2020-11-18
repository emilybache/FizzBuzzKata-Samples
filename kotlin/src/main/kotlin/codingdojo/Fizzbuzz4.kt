package codingdojo;

class Fizzbuzz4(val from: Int, val to: Int) {
    companion object {
        fun fizzbuzz() {
            val fizzbuzz4 = Fizzbuzz4();
            fizzbuzz4.calculateFizzbuzz()?.forEach(System.out::println);
        }
    }

    constructor(): this (1, 100) {}

    var fizzbuzz: List<String>? = null

    fun calculateFizzbuzz(): List<String>? {
        if (fizzbuzz == null) {
            calculateFizzbuzzNumbers();
        }
        return fizzbuzz
    }

    private fun calculateFizzbuzzNumbers() {
        fizzbuzz = (from..to).map{n -> nToFizzbuzz(n)}
    }

    private fun nToFizzbuzz(n: Int): String {
        if (n % 15 == 0)
            return "FizzBuzz";
        else if (n % 3 == 0)
            return "Fizz";
        else if (n % 5 == 0)
            return "Buzz";
        else
            return "$n";
    }
}
