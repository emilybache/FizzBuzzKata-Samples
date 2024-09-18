namespace FizzBuzz6;

public class FizzBuzz6(FizzBuzz6.Range range, List<FizzBuzz6.Factor> factors)
{
    public FizzBuzz6() : this(new Range(1, 101), new List<Factor>
    {
        new Factor("Fizz", 3),
        new Factor("Buzz", 5)
    }) { }

    public List<Provider> CalculateFizzbuzz()
    {
        FizzbuzzCalculator calculator = new FizzbuzzCalculator(factors);
        return range.Stream().Select(calculator.Convert).ToList();
    }

    public class FizzbuzzCalculator
    {
        private readonly List<Factor> factors;

        public FizzbuzzCalculator(List<Factor> factors)
        {
            this.factors = factors;
        }

        public Provider Convert(int n)
        {
            var result = new System.Text.StringBuilder();
            foreach (var factor in factors)
            {
                if (factor.Predicate(n))
                {
                    result.Append(factor.Name);
                }
            }
            return new Provider(result.ToString(), n);
        }
    }

    public class Provider
    {
        private int n;
        private string provided;

        public Provider(string provided, int n)
        {
            this.provided = provided;
            this.n = n;
        }

        public string Provide()
        {
            return string.IsNullOrEmpty(provided) ? n.ToString() : provided;
        }

        public override string ToString()
        {
            return Provide();
        }
    }

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
    

    public class Range
    {
        private readonly int from;
        private readonly int to;

        public Range(int from, int to)
        {
            this.from = from;
            this.to = to;
        }

        public IEnumerable<int> Stream()
        {
            return Enumerable.Range(this.from, this.to - this.from);
        }
    }

}