using System;
using System.Collections.Generic;
using System.IO;

namespace Fajlkezeles
{
    class Program
    {
        static void Main(string[] args)
        {
            using (var iro = new StreamWriter("out.txt"))
            {
                iro.WriteLine("hello");
                iro.WriteLine("world");
                iro.WriteLine("{0} {1} éves.", "Pisti", 30);
            }

            // ----------

            List<string> sorok = FileUtils.ReadLines("in.txt");
            Console.WriteLine("Fájl tartalma:");
            Console.WriteLine("--------------");
            foreach (var sor in sorok)
            {
                Console.WriteLine(sor);
            }

            Console.WriteLine();

            Console.WriteLine("Számok:");
            Console.WriteLine("-------");
            List<int> szamok = FileUtils.ReadLinesAsInts("szamok.txt");
            Console.WriteLine(string.Join(", ", szamok));

            Console.WriteLine("\nProgram: END");
        }
    }
}