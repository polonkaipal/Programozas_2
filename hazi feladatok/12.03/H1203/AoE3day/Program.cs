using System;
using System.Collections.Generic;
using System.Numerics;
using Fajlkezeles;

namespace AoE3day
{
    class Program
    {
        static List<string> sorok = FileUtils.ReadLines("input.txt");

        static void Main(string[] args)
        {
            feladat_1();
            feladat_2();
        }

        private static void feladat_2()
        {
            FakSzama(1, 1);
            BigInteger szorzat = (BigInteger) FakSzama(1, 1) *
                                 FakSzama(3, 1) *
                                 FakSzama(5, 1) *
                                 FakSzama(7, 1) *
                                 FakSzama(1, 2);
            Console.WriteLine("Fák száma: {0}", szorzat);
        }

        private static void feladat_1()
        {
            Console.WriteLine("Fák száma: {0}", FakSzama(3, 1));
        }

        private static int FakSzama(int right, int down)
        {
            int sorHossza = sorok[0].Length;
            int elore = right;
            int kezdo = 0;
            int db = 0;

            for (int i = 1; i < sorok.Count; i += down)
            {
                kezdo += elore;
                kezdo %= sorHossza;
                if (sorok[i][kezdo] == '#')
                {
                    db++;
                }
            }

            return db;
        }
    }
}