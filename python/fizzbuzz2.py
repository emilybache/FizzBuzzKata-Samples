
def fizzbuzz2():
    for item in calculate_fizzbuzz():
        print(item)


def calculate_fizzbuzz():
    result = []
    for n in range(1, 101):
        if n % 3 == 0 and n % 5 == 0:
            result.append("FizzBuzz")
        elif n % 5 == 0:
            result.append("Buzz")
        elif n % 3 == 0:
            result.append("Fizz")
        else:
            result.append(n)
    return result