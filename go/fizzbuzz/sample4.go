package fizzbuzz

import (
	"fmt"
	"strconv"
)

func fizzbuzz4() {
	calculator := defaultFizzbuzzCalculator()
	fmt.Print(calculator.print())
}

type FbFactor struct {
	number int
	conversion string
}

type FbRange struct {
	min int
	max int
}

type FbCalculator struct {
	factors []FbFactor
	fbRange FbRange
}

func defaultFizzbuzzCalculator() FbCalculator {
	fizzFactor := FbFactor{3, "Fizz"}
	buzzFactor := FbFactor{5, "Buzz"}
	factors := []FbFactor{fizzFactor, buzzFactor}
	fbRange := FbRange{1,100}
	return FbCalculator{factors, fbRange}
}

func (calculator FbCalculator)calculate(n int) string {
	output := ""
	for _, factor := range calculator.factors {
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

func (calculator FbCalculator)print() string {
	output := ""
	for i := calculator.fbRange.min; i <= calculator.fbRange.max; i++ {
		output += calculator.calculate(i)
		output += "\n"
	}
	return output
}
