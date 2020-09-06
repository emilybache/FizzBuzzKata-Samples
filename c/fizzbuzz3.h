#ifndef FIZZBUZZ_FIZZBUZZ3_H
#define FIZZBUZZ_FIZZBUZZ3_H

#include <stdio.h>
#include <cstring>
#include <cstdlib>

void fizzbuzz3_converter(int i, char* result);

void fizzbuzz3()
{
    int i;
    for(i=1; i<=100; ++i)
    {
        char* result = (char *) malloc(9);
        fizzbuzz3_converter(i, result);
        printf("%s\n", result);
    }
}

typedef struct Factor {
    int number;
    char* conversion;
} Factor;

void fizzbuzz3_converter(int i, char* result)
{
    Factor fizz = {.number  = 3, .conversion = "Fizz"};
    Factor buzz = {.number = 5, .conversion = "Buzz"};
    Factor factors[] = {fizz, buzz};

    for (int j = 0; j < sizeof(factors)/sizeof(factors[0]); ++j)
    {
        bool hasFactor = i%factors[j].number == 0;
        if (hasFactor)
        {
            strncat(result, factors[j].conversion, sizeof(factors[j].conversion));
        }
    }
    if (strcmp(result, "") == 0)
    {
        sprintf( result, "%d", i );
    }

}

#endif //FIZZBUZZ_FIZZBUZZ3_H
