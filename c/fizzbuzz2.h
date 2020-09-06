#ifndef FIZZBUZZ_FIZZBUZZ2_H
#define FIZZBUZZ_FIZZBUZZ2_H

#include <stdio.h>
#include <cstring>

void fizzbuzz_for_n(int i, char* result);

void fizzbuzz2()
{
    int i;
    for(i=1; i<=100; ++i)
    {
        char* result = (char *) malloc(9);
        fizzbuzz_for_n(i, result);
        printf("%s\n", result);
    }
}

void fizzbuzz_for_n(int i, char* result)
{
    if (i % 15 == 0)
        sprintf(result, "FizzBuzz");
    else if (i % 3 == 0)
        sprintf(result, "Fizz");
    else if (i % 5 == 0)
        sprintf(result, "Buzz");
    else
        sprintf(result, "%d", i);
}

#endif //FIZZBUZZ_FIZZBUZZ2_H
