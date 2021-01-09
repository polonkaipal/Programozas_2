using System;
using System.Collections.Generic;
using Fajlkezeles;

namespace AoE5day
{
    class Program
    {
        static void Main(string[] args)
        {
            feladat_1();
        }

        private static void feladat_1()
        {
            List<string> sorok = FileUtils.ReadLines("input.txt");
            int max = Convert.ToInt32(GetSeatId(sorok[0]));
            for (int i = 1; i < sorok.Count; i++)
            {
                max = Math.Max(max, GetSeatId(sorok[i]));
            }

            Console.WriteLine(max);
        }

        private static int GetSeatId(string bsp)
        {
            int kezdoOszlop = 0;
            int vegsoOszlop = 128;
            int kezdoSor = 0;
            int vegsoSor = 8;

            foreach (var c in bsp)
            {
                switch (c)
                {
                    case 'F':
                        vegsoOszlop -= (vegsoOszlop - kezdoOszlop) / 2;
                        break;

                    case 'B':
                        kezdoOszlop += (vegsoOszlop - kezdoOszlop) / 2;
                        break;

                    case 'L':
                        vegsoSor -= (vegsoSor - kezdoSor) / 2;
                        break;

                    case 'R':
                        kezdoSor += (vegsoSor - kezdoSor) / 2;
                        break;
                }
            }

            return kezdoOszlop * 8 + kezdoSor;
        }
    }
}