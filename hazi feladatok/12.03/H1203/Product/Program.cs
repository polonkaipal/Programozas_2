using System;
using System.Collections.Generic;
using System.Linq;

namespace Product
{
    class Program
    {
        static void Main(string[] args)
        {
            var szamok = new List<int> {8, 3, 2, 1, 5, 9, 2};
            var result = szamok.Where(i => i <= 2).Product();
            Console.WriteLine(result);
        }
    }
}