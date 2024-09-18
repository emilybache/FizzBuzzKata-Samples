namespace FizzBuzz5;

public class FizzBuzz5
{
    public static List<string> CalculateFizzbuzz()
    {
        var range = Enumerable.Range(1, 100);
        return range.Select(FizzbuzzFactor).ToList();
    }

    static string FizzbuzzFactor(int n)
    {
        var result = new System.Text.StringBuilder();
        foreach (var factor in factors)
        {
            if (factor.Predicate(n))
            {
                result.Append(factor.Name);
            }
        }

        var fizzbuzz = result.ToString();
        return string.IsNullOrEmpty(fizzbuzz) ? n.ToString() : fizzbuzz;
    }

    private static List<Factor> factors = new List<Factor>
    {
        new Factor("Fizz", 3),
        new Factor("Buzz", 5)
    };

    public class Factor
    {
        public string Name { get; }
        public Func<int, bool> Predicate { get; }

        public Factor(string name, int factor)
        {
            Name = name;
            Predicate = n => n % factor == 0;
        }
    }
}