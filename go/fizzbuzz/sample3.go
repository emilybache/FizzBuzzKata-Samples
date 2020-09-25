package fizzbuzz

import (
	"fmt"
	"strconv"
)

func fizzbuzz3() {
	for i := 1; i <= 100; i++ {
		fmt.Println(fizzbuzzConverter(i))
	}
}

type Factor struct {
	number int
	conversion string
}

func fizzbuzzConverter(n int) string {
	fizzFactor := Factor{3, "Fizz"}
	buzzFactor := Factor{5, "Buzz"}
	factors := []Factor{fizzFactor, buzzFactor}

	output := ""
	for _, factor := range factors {
		hasFactor := n % factor.number == 0
		if hasFactor {
			output += factor.conversion
		}
	}
	if output == "" {
		output = strconv.Itoa(n)
	}
	return output
}