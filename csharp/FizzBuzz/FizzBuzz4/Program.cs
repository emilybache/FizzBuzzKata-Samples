using System;
using System.Collections.Generic;
using System.Linq;

public class Program
{
    
    public static void Main()
    {
        FizzBuzz4.FizzBuzz4 fizzbuzz4 = new FizzBuzz4.FizzBuzz4(1, 101);
        fizzbuzz4.GetFizzbuzz().ForEach(Console.WriteLine);
    }
    
}