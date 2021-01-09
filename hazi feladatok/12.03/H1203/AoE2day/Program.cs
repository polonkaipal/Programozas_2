using System;
using System.Collections.Generic;
using System.Linq;
using Fajlkezeles;

namespace AoE2day
{
    class Program
    {
        static void Main(string[] args)
        {
            feladat_1();
            feladat_2();
        }

        private static void feladat_2()
        {
            List<string> sorok = FileUtils.ReadLines("input.txt");
            int db = 0;
            int egyik, masik;
            foreach (var sor in sorok)
            {
                string[] reszek = sor.Split();
                string[] tmp = reszek[0].Split("-");
                egyik = Convert.ToInt32(tmp[0]);
                masik = Convert.ToInt32(tmp[1]);
                if ((reszek[2][egyik - 1] == reszek[1][0] || reszek[2][masik - 1] == reszek[1][0]) &&
                    reszek[2][egyik - 1] != reszek[2][masik - 1])
                {
                    db++;
                }
            }

            Console.WriteLine("Érvényes {0} jelszo", db);
        }

        private static void feladat_1()
        {
            List<string> sorok = FileUtils.ReadLines("input.txt");
            int db = 0;
            int cnt;
            int min, max;
            foreach (var sor in sorok)
            {
                string[] reszek = sor.Split();
                string[] tmp = reszek[0].Split("-");
                min = Convert.ToInt32(tmp[0]);
                max = Convert.ToInt32(tmp[1]);
                cnt = reszek[2].Count(c => c == reszek[1][0]);
                if (cnt >= min && cnt <= max)
                {
                    db++;
                }
            }

            Console.WriteLine("Érvényes {0} jelszo", db);
        }
    }
}