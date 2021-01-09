using System;
using System.Collections.Generic;
using Fajlkezeles;

namespace AoE1day
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
            List<int> szamok = FileUtils.ReadLinesAsInts("input.txt");
            for (int i = 0; i < szamok.Count - 2; i++)
            {
                for (int j = i + 1; j < szamok.Count - 1; j++)
                {
                    for (int k = j + 1; k < szamok.Count; k++)
                    {
                        if (szamok[i] + szamok[j] + szamok[k] == 2020)
                        {
                            Console.WriteLine("Szorzat: {0}", szamok[i] * szamok[j] * szamok[k]);
                            break;
                        }
                    }
                }
            }
        }

        private static void feladat_1()
        {
            List<int> szamok = FileUtils.ReadLinesAsInts("input.txt");
            for (int i = 0; i < szamok.Count - 1; i++)
            {
                for (int j = i + 1; j < szamok.Count; j++)
                {
                    if (szamok[i] + szamok[j] == 2020)
                    {
                        Console.WriteLine("Szorzat: {0}", szamok[i] * szamok[j]);
                        break;
                    }
                }
            }
        }
    }
}