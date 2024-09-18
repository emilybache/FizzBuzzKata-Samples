using System;
using System.Collections.Generic;
namespace FizzBuzz2;

public class Program
{
    public static void Main()
    {
        foreach (var item in CalculateFizzbuzz())
        {
            Console.WriteLine(item);
        }
    }

    public static List<string> CalculateFizzbuzz()
    {
        var result = new List<string>();
        for (int n = 1; n <= 100; n++)
        {
            if (n % 3 == 0 && n % 5 == 0)
                result.Add("FizzBuzz");
            else if (n % 3 == 0)
                result.Add("Fizz");
            else if (n % 5 == 0)
                result.Add("Buzz");
            else
                result.Add(n.ToString());
        }

        return result;
    }
}
