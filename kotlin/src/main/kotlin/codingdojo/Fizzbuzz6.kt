package codingdojo

class Fizzbuzz6 {
    companion object {
        fun fizzbuzz() {
            val fizzbuzz6 = Fizzbuzz6();
            fizzbuzz6.calculateFizzbuzz().forEach(System.out::println);
        }
    }

    val range = Range(1, 100);
    val factors = listOf(Factor("Fizz", 3), Factor("Buzz", 5));

    fun calculateFizzbuzz(): List<Provider> {
        val calculator = FizzbuzzCalculator(factors);
        return this.range.stream().map{i -> calculator.convert(i)};
    }

    class FizzbuzzCalculator(val factors: List<Factor>) {

        fun convert(n: Int): Provider {
            val result = StringBuilder();
            for (factor in factors) {
                if (factor.predicate(n)) {
                    result.append(factor.name);
                }
            }
            return Provider(n, result.toString());
        }
    }

    class Provider(val n: Int, val provided: String) {

        fun provide(): String {
            if ("".equals(provided))
                return "$n"
            return provided;
        }

        override fun toString(): String {
            return provide();
        }
    }

    class Range(val from: Int, val to: Int) {
        fun stream(): IntRange {
            return (this.from..this.to)
        }
    }

    class Factor(val name: String, val factor: Int) {
        val predicate =  {n: Int -> n % factor == 0}
    }
}
