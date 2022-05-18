
def fizzbuzz3():
    for item in calculate_fizzbuzz():
        print(item)


def calculate_fizzbuzz():
    return (n_to_fizzbuzz(n) for n in range(1, 101))


def n_to_fizzbuzz(n):
    if n % 3 == 0 and n % 5 == 0:
        return "FizzBuzz"
    elif n % 5 == 0:
        return "Buzz"
    elif n % 3 == 0:
        return "Fizz"
    else:
        return n