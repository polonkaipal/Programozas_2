using System;

namespace F20190901a
{
    public class FizzBuzz
    {
        public void Start(int kezdo = 1, int vege = 100)
        {
            for (int i = kezdo; i <= vege; i++)
            {
                if (i % 3 == 0 && i % 5 == 0)
                {
                    Console.WriteLine("fizzbuzz");
                    continue;
                }

                if (i % 3 == 0)
                {
                    Console.WriteLine("fizz");
                    continue;
                }

                if (i % 5 == 0)
                {
                    Console.WriteLine("buzz");
                    continue;
                }

                Console.WriteLine(i);
            }
        }
    }
}