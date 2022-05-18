
def fizzbuzz5():
    fb5 = FizzBuzz5(1, 101)
    for item in fb5.calculate_fizzbuzz():
        print(item)


class FizzBuzzFactor:

    def __init__(self, name, n):
        self.name = name
        self.n = n

    def is_a_factor(self, n):
        return n % self.n == 0


class FizzBuzz5:
    def __init__(self, start, end):
        self.start = start
        self.end = end
        self.factors = [
            FizzBuzzFactor("Fizz", 3),
            FizzBuzzFactor("Buzz", 5),
        ]

    def n_to_fizzbuzz(self, n):
        result = ""
        for factor in self.factors:
            if factor.is_a_factor(n):
                result += factor.name
        if not result:
            result = n
        return result

    def calculate_fizzbuzz(self):
        return (self.n_to_fizzbuzz(n) for n in range(self.start, self.end))
