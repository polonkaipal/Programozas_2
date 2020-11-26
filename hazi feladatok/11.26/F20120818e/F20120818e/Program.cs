using System;

namespace F20120818e
{
    class Program
    {
        static void Main(string[] args)
        {
            int max = 1000;
            int sum = 0;
            for (int i = 3; i < max; i++)
            {
                if (i % 3 == 0 || i % 5 == 0)
                {
                    sum += i;
                }
            }
            Console.WriteLine("Pozitív számok összege {0}-ig: {1}", max, sum);
        }
    }
}