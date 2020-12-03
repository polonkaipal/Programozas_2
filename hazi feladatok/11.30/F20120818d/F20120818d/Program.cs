using System;
using System.Collections.Generic;
using System.Linq;

namespace F20120818d
{
    class Program
    {
        static void Main(string[] args)
        {
            // 1. feladat
            //['auto', 'villamos', 'metro'] → ['AUTO!', 'VILLAMOS!', 'METRO!']
            Console.WriteLine("1. feladat:");
            List<string> szavak = new List<string> {"auto", "villamos", "metro"}.Select(s => s.ToUpper() + "!")
                .ToList();
            foreach (var s in szavak)
            {
                Console.WriteLine(s);
            }

            Console.WriteLine();

            //2. feladat
            //['aladar', 'bela', 'cecil'] → ['Aladar', 'Bela', 'Cecil']
            Console.WriteLine("2. feladat:");
            szavak = new List<string> {"aladar", "bela", "cecil"}.Select(s => char.ToUpper(s[0]) + s[1..].ToLower())
                .ToList();
            foreach (var s in szavak)
            {
                Console.WriteLine(s);
            }

            Console.WriteLine();

            //3. feladat
            //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0], azaz inicializáljunk egy 10-elemű listát csupa 0-val.
            Console.WriteLine("3. feladat:");
            List<int> szamok = PyUtils.Range(10).Select(s => 0).ToList();
            foreach (var szam in szamok)
            {
                Console.WriteLine(szam);
            }

            Console.WriteLine();

            //4. feladat
            //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10] → [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
            Console.WriteLine("4. feladat:");
            szamok = PyUtils.Range(1, 11).Select(n => n * 2).ToList();

            foreach (var szam in szamok)
            {
                Console.WriteLine(szam);
            }

            Console.WriteLine();

            //5. feladat
            //['1', '2', '3', '4', '5', '6', '7', '8', '9', '10'] → [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] (az első listában sztringek vannak)
            Console.WriteLine("5. feladat:");
            szamok = new List<string> {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}.Select(s => int.Parse(s))
                .ToList();

            foreach (var szam in szamok)
            {
                Console.WriteLine(szam);
            }

            Console.WriteLine();

            //6. feladat
            //"1234567" → [1, 2, 3, 4, 5, 6, 7], vagyis van számunk sztring formátumban, s egy listába be akarjuk tenni a számjegyeit (számokként)
            Console.WriteLine("6. feladat:");
            szamok = "1234567".ToCharArray().ToList().Select(c => c - '0').ToList();

            foreach (var szam in szamok)
            {
                Console.WriteLine(szam);
            }

            Console.WriteLine();

            //7. feladat
            //'The quick brown fox jumps over the lazy dog' → [3, 5, 5, 3, 5, 4, 3, 4, 3], vagyis állapítsuk meg az egyes szavak hosszát
            Console.WriteLine("7. feladat:");
            szamok = "The quick brown fox jumps over the lazy dog".Split().ToList().Select(s => s.Length).ToList();

            foreach (var szam in szamok)
            {
                Console.WriteLine(szam);
            }

            Console.WriteLine();

            //8. feladat
            //"python is an awesome language" → ['p', 'i', 'a', 'a', 'l'], vagyis egy sztring szavainak a kezdőbetűit gyűjtsük össze egy listában
            Console.WriteLine("8. feladat:");
            List<char> chs = "python is an awesome language".Split().ToList().Select(s => s[0]).ToList();

            foreach (var c in chs)
            {
                Console.WriteLine(c);
            }

            Console.WriteLine();

            //9. feladat
            //'The quick brown fox jumps over the lazy dog' → [('The', 3), ('quick', 5), ('brown', 5), ('fox', 3), ('jumps', 5), ('over', 4), ('the', 3), ('lazy', 4), ('dog', 3)], vagyis a listában tuple-öket helyezzünk el a következő szerkezettel: (szó, szóhossz).
            Console.WriteLine("9. feladat:");
            var tuples = "The quick brown fox jumps over the lazy dog".Split().ToList().Select(s => (s, s.Length))
                .ToList();

            foreach (var t in tuples)
            {
                Console.WriteLine(t);
            }

            Console.WriteLine();

            //10. feladat
            //[0, 2, 4, 6, 8], vagyis állítsuk elő egy listában a 10-nél kisebb páros számokat
            Console.WriteLine("10. feladat:");
            szamok = PyUtils.Range(10).Where(i => i % 2 == 0).ToList();

            foreach (var szam in szamok)
            {
                Console.WriteLine(szam);
            }

            Console.WriteLine();

            //11. feladat
            //Vegyük a 20-nál kisebb számokat s állítsuk elő ezeknek a négyzetét. Ezen négyzetszámok közül csak a párosakat hagyjuk meg ([0, 4, 16, 36, 64, 100, 144, 196, 256, 324]).
            Console.WriteLine("11. feladat:");
            szamok = PyUtils.Range(20).Select(i => i * i).Where(i => i % 2 == 0).ToList();

            foreach (var szam in szamok)
            {
                Console.WriteLine(szam);
            }

            Console.WriteLine();

            //12. feladat
            //Vegyük a 20-nál kisebb számokat s állítsuk elő ezeknek a négyzetét. Ezen négyzetszámok közül csak azokat hagyjuk meg, melyeknek az utolsó számjegye "4" ([4, 64, 144, 324]).
            Console.WriteLine("12. feladat:");
            szamok = PyUtils.Range(20).Select(i => i * i).Select(i => i.ToString()).Where(s => s[^1] == '4')
                .Select(s => int.Parse(s))
                .ToList();

            foreach (var szam in szamok)
            {
                Console.WriteLine(szam);
            }

            Console.WriteLine();

            //13. feladat
            //Gyűjtsük össze az angol ábécé nagybetűit egy listában (használjuk a chr függvényt), majd fűzzük össze az elemeket egyetlen sztringgé: 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'.
            Console.WriteLine("13. feladat:");
            String str = new String(PyUtils.Range('A', 'Z' + 1).Select(i => Convert.ToChar(i)).ToArray());
            Console.WriteLine(str);

            Console.WriteLine();

            //14. feladat
            //[' apple ', ' banana ', ' kiwi'] → ['apple', 'banana', 'kiwi'], vagyis a listában lévő szavak elejéről és végéről távolítsuk el a whitespace karaktereket
            Console.WriteLine("14. feladat:");
            szavak = new List<string> {" apple ", " banana ", " kiwi"}.Select(s => s.Trim()).ToList();
            foreach (var szo in szavak)
            {
                Console.WriteLine("'" + szo + "'");
            }

            Console.WriteLine();

            //15. feladat
            //[1, 0, 1, 1, 0, 1, 0, 0] → "10110100", vagyis a listában lévő számjegyeket fűzzük össze egy sztringgé 
            Console.WriteLine("15. feladat:");
            str = new String(new List<int> {1, 0, 1, 1, 0, 1, 0, 0}.Select(i => Convert.ToChar(1 + '0')).ToArray());

            Console.WriteLine(str);
        }
    }
}