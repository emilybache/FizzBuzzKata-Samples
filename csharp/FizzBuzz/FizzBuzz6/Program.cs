
using System;
using System.Collections.Generic;
using System.Linq;

namespace FizzBuzz6;

public class Program
{
    public static void Main()
    {
        FizzBuzz6 fizzBuzz6 = new FizzBuzz6();
        fizzBuzz6.CalculateFizzbuzz()
            .ForEach(Console.WriteLine);
    }
}