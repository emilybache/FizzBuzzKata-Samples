#ifndef FIZZBUZZ_FIZZBUZZ1_H
#define FIZZBUZZ_FIZZBUZZ1_H

#include <stdio.h>
void fizzbuzz1()
{
	int i;
    for(i=1; i<=100; ++i)
    {
        if (i % 3 == 0)
            printf("Fizz");
        if (i % 5 == 0)
            printf("Buzz");
        if ((i % 3 != 0) && (i % 5 != 0))
            printf("%d", i);
        printf("\n");
    }
}

#endif //FIZZBUZZ_FIZZBUZZ1_H
