using System;
using System.Linq;

namespace F20120818e
{
    class Program
    {
        static void Main(string[] args)
        {
            int osszeg = PyUtils.Range(1000).Where(i => i % 3 == 0 || i % 5 == 0).Sum();
            Console.WriteLine(osszeg);
        }
    }
}