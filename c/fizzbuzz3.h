#ifndef FIZZBUZZ_FIZZBUZZ3_H
#define FIZZBUZZ_FIZZBUZZ3_H

#include <stdio.h>
#include <cstring>
#include <cstdlib>

static const int FIZZBUZZ3_MAX_LENGTH = 9;
static const int FIZZ3_OR_BUZZ_LENGTH = 5;

void fizzbuzz3_converter(int i, char* result);

void fizzbuzz3()
{
    int i;
    for(i=1; i<=100; ++i)
    {
        char* result = (char *) malloc(FIZZBUZZ3_MAX_LENGTH);
        memset(result, 0, FIZZBUZZ3_MAX_LENGTH);
        fizzbuzz3_converter(i, result);
        printf("%s\n", result);
        free(result);
    }
}

typedef struct Factor {
    int number;
    char* conversion;
} Factor;

void fizzbuzz3_converter(int i, char* result)
{
    char fizz[FIZZ3_OR_BUZZ_LENGTH] = "Fizz";
    char buzz[FIZZ3_OR_BUZZ_LENGTH] = "Buzz";

    Factor fizzFactor = {.number  = 3, .conversion = fizz};
    Factor buzzFactor = {.number = 5, .conversion = buzz};
    Factor factors[] = {fizzFactor, buzzFactor};

    for (unsigned long j = 0; j < sizeof(factors)/sizeof(factors[0]); ++j)
    {
        bool hasFactor = i % factors[j].number == 0;
        if (hasFactor)
        {
            strncat(result, factors[j].conversion, FIZZ3_OR_BUZZ_LENGTH);
            result[9-1] = '\0';
        }
    }
    if (strcmp(result, "") == 0)
    {
        sprintf( result, "%d", i );
    }

}

#endif //FIZZBUZZ_FIZZBUZZ3_H
