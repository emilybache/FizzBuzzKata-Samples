
def fizzbuzz4():
    fb4 = FizzBuzz4(1, 101)
    for item in fb4.get_fizzbuzz():
        print(item)


class FizzBuzz4:
    def __init__(self, start, end):
        self.start = start
        self.end = end
        self.fizzbuzz = None

    def get_fizzbuzz(self):
        if self.fizzbuzz is None:
            self.calculate_fizzbuzz()
        return self.fizzbuzz

    def calculate_fizzbuzz(self):
        self.fizzbuzz = (n_to_fizzbuzz(n) for n in range(self.start, self.end))


def n_to_fizzbuzz(n):
    result = ""
    if n % 3 == 0:
        result += "Fizz"
    if n % 5 == 0:
        result += "Buzz"

    if not result:
        result = n
    return result