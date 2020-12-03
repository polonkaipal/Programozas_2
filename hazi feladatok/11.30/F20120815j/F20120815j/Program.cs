using System;
using System.Linq;

namespace F20120815j
{
    class Program
    {
        static int IntetFordit(int i)
        {
            return Convert.ToInt32(new String(i.ToString().Reverse().ToArray()));
        }

        static void Main(string[] args)
        {
            Console.WriteLine("{0} -> {1}", 1977, IntetFordit(1977));
            Console.WriteLine("{0} -> {1}", 12568, IntetFordit(12568));
        }
    }
}