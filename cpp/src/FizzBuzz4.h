#ifndef FIZZBUZZ_FIZZBUZZ4_H
#define FIZZBUZZ_FIZZBUZZ4_H


#include <vector>

class FizzBuzz4 {
private:
    int _start;
    int _end;
public:
    explicit FizzBuzz4(int start=1, int end=101) : _start(start), _end(end){};
    void fizzbuzz();
    std::vector<std::string> calculateFizzBuzz();
    static std::string nToFizzBuzz(int n);
};


#endif //FIZZBUZZ_FIZZBUZZ4_H
