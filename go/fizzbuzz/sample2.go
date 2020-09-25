package fizzbuzz

import (
	"fmt"
	"strconv"
)

func fizzbuzz2() {
	for i := 1; i <= 100; i++ {
		fmt.Println(fizzbuzzFor(i))
	}
}

func fizzbuzzFor(number int) string {
	output := ""
	if number % 3 == 0 {
		output+="Fizz"
	}
	if number % 5 == 0 {
		output+="Buzz"
	}
	if output == "" {
		output = strconv.Itoa(number)
	}

	return output
}
