def fizzbuzz6():
    fb6 = FizzBuzz6()
    for item in fb6.calculate_fizzbuzz():
        print(item)


class FizzBuzz6:
    def __init__(self):
        self.factors = [
            Factor("Fizz", 3),
            Factor("Buzz", 5),
        ]
        self.range = Range(1, 101)

    def calculate_fizzbuzz(self):
        calculator = FizzBuzzCalculator(self.factors)
        return (calculator.convert(n) for n in self.range.stream())


class Factor:

    def __init__(self, name, n):
        self.name = name
        self.n = n

    def is_a_factor(self, n):
        return n % self.n == 0


class Range:
    def __init__(self, start, end):
        self.start = start
        self.end = end

    def stream(self):
        return (i for i in range(self.start, self.end))


class FizzBuzzCalculator:

    def __init__(self, factors):
        self.factors = factors

    def convert(self, n):
        result = ""
        for factor in self.factors:
            if factor.is_a_factor(n):
                result += factor.name
        return Provider(result, n)


class Provider:

    def __init__(self, provided, n):
        self.provided = provided
        self.n = n

    def provide(self):
        if "" == self.provided:
            return str(self.n)
        return self.provided

    def __str__(self):
        return self.provide()
