using System;
using System.Collections.Generic;
using System.Linq;

namespace Capitalize
{
    class Program
    {
        static void Main(string[] args)
        {
            feladat_2();
        }

        private static void feladat_2()
        {
            var input = new List<string> {"aladar", "bela", "cecil"};
            var result = input.Select(s => s.Capitalize());
            Console.WriteLine(string.Join(", ", result));
        }
    }
}