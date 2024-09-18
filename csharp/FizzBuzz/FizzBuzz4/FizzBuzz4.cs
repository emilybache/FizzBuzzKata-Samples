namespace FizzBuzz4;

public class FizzBuzz4
{
    private readonly int _from;
    private readonly int _to;
    private List<string>? _fizzbuzz;

    public FizzBuzz4() : this(1, 101) { }
    public FizzBuzz4(int from, int to)
    {
        this._from = from;
        this._to = to;
    }

    public List<string> GetFizzbuzz()
    {
        if (_fizzbuzz == null)
        {
            CalculateFizzbuzz();
        }

        return _fizzbuzz;
    }

    private void CalculateFizzbuzz()
    {
        _fizzbuzz = Enumerable.Range(_from, _to - _from)
            .Select(n => NToFizzbuzz(n))
            .ToList();
    }

    private string NToFizzbuzz(int n)
    {
        if (n % 15 == 0)
            return "FizzBuzz";
        else if (n % 3 == 0)
            return "Fizz";
        else if (n % 5 == 0)
            return "Buzz";
        else
            return n.ToString();
    }
}