#ifndef FIZZBUZZ_FIZZBUZZ5_H
#define FIZZBUZZ_FIZZBUZZ5_H


#include <utility>
#include <vector>

class FizzBuzzFactor {
public:
    FizzBuzzFactor(std::string _name, int _factor): name(std::move(_name)), factor(_factor) {};
    bool isAFactor(int n) const;
    std::string getName() const;
private:
    const std::string name;
    const int factor;
};

class FizzBuzz5 {
public:
    FizzBuzz5();
    void fizzbuzz();
    static std::vector<std::string> calculateFizzBuzz();
    std::string nToFizzBuzz(int n);
    std::string fizzBuzzFactor(int n);
private:
    std::vector<FizzBuzzFactor>* factors;
};


#endif //FIZZBUZZ_FIZZBUZZ5_H
