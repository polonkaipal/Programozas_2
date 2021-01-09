using System;
using System.Linq;

namespace Mass
{
    class Program
    {
        static void Main(string[] args)
        {
            {
                string urlSablon = "http://example.com/galleryFX/{{szam}}.jpg";
                string placeholder = "{{szam}}";
                int max = 15;

                feladat_1(urlSablon, placeholder, max);
                Console.WriteLine(string.Concat(Enumerable.Repeat("-", 50)));
                feladat_2(urlSablon, placeholder, max);
            }
        }

        private static void feladat_2(string url, string placeholder, int max)
        {
            for (int i = 1; i <= max; i++)
            {
                Console.WriteLine(url.Replace(placeholder, (i / 10) + (i % 10).ToString()));
            }
        }

        private static void feladat_1(string url, string placeholder, int max)
        {
            for (int i = 1; i <= max; i++)
            {
                Console.WriteLine(url.Replace(placeholder, i.ToString()));
            }
        }
    }
}