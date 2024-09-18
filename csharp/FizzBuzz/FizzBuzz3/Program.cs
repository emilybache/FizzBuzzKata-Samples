// See https://aka.ms/new-console-template for more information

using System;
using System.Collections.Generic;
using System.Linq;
namespace FizzBuzz3;

public class Program
{
    public static void Main()
    {
        CalculateFizzbuzz().ForEach(Console.WriteLine);
    }

    public static List<string> CalculateFizzbuzz()
    {
        return Enumerable.Range(1, 100)
            .Select(n => NToFizzbuzz(n))
            .ToList();
    }

    static string NToFizzbuzz(int n)
    {
        if (n % 3 == 0 && n % 5 == 0)
            return "FizzBuzz";
        else if (n % 3 == 0)
            return "Fizz";
        else if (n % 5 == 0)
            return "Buzz";
        else
            return n.ToString();
    }
}
