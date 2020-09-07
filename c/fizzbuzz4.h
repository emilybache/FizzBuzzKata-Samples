#ifndef FIZZBUZZ_FIZZBUZZ4_H
#define FIZZBUZZ_FIZZBUZZ4_H


#include <stdio.h>
#include <cstring>
#include <cstdlib>

void fizzbuzz4_converter(int i, char* result);

static const int FIZZBUZZ_MAX_LENGTH = 9;

void fizzbuzz4()
{
    int i;
    for(i=1; i<=100; ++i)
    {
        char* result = (char *) malloc(FIZZBUZZ_MAX_LENGTH);
        memset(result, 0, FIZZBUZZ_MAX_LENGTH);
        fizzbuzz4_converter(i, result);
        printf("%s\n", result);
    }
}

typedef struct Factor4 {
    int number;
    char* conversion;
} Factor4;

Factor4* create_factor4(int number, char* conversion) {
    Factor4* p = (Factor4 *)malloc(sizeof(Factor4));

    p->number = number;
    p->conversion = conversion;

    return p;
}

void convertWithFactors(int i, char *result, const Factor4 *factors, int totalFactors) {
    for (int j = 0; j < totalFactors; ++j)
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

void fizzbuzz4_converter(int i, char* result)
{
    int total_factors = 2;
    Factor4* factors = (Factor4*)malloc(total_factors*sizeof(Factor4));

    factors[0] = *create_factor4(3, "Fizz");
    factors[1] = *create_factor4(5, "Buzz");

    convertWithFactors(i, result, factors, total_factors);

}
#endif //FIZZBUZZ_FIZZBUZZ4_H
