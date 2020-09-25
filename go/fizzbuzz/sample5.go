package fizzbuzz

import (
	"fmt"
	"strconv"
)

func fizzbuzz5() {
	calculator := defaultFizzBuzzCalculator()
	for _, item := range calculator.print() {
		fmt.Print(item.String())
	}
}

type FBFactor struct {
	number int
	conversion string
}

type FBRange struct {
	min int
	max int
}

type Calculator struct {
	factors []FBFactor
	fbRange FBRange
}

func defaultFizzBuzzCalculator() Calculator {
	fizzFactor := FBFactor{3, "Fizz"}
	buzzFactor := FBFactor{5, "Buzz"}
	factors := []FBFactor{fizzFactor, buzzFactor}
	fbRange := FBRange{1,100}
	return Calculator{factors, fbRange}
}

type Provider struct {
	provided string
	n int
}

func (provider Provider)provide() string {
	if provider.provided == "" {
		return strconv.Itoa(provider.n)
	}
	return provider.provided
}

func (provider Provider)String() string {
	return provider.provide()
}

func (calculator Calculator)calculate(n int) Provider {
	output := ""
	for _, factor := range calculator.factors {
		hasFactor := n % factor.number == 0
		if hasFactor {
			output += factor.conversion
		}
	}
	return Provider{output, n}
}

func (calculator Calculator)print() []Provider {
	size := calculator.fbRange.max - calculator.fbRange.min + 1
	output := make([]Provider, 0, size)
	for i := calculator.fbRange.min; i <= calculator.fbRange.max; i++ {
		output[i] = calculator.calculate(i)
	}
	return output
}
