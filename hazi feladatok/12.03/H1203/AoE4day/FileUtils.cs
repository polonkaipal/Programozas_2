using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace Fajlkezeles
{
    public static class FileUtils
    {
        public static List<string> ReadLines(string input)
        {
            List<string> li = new List<string>();
            StreamReader olvaso = null;
            try
            {
                olvaso = new StreamReader(input);
                string sor;

                while ((sor = olvaso.ReadLine()) != null)
                {
                    li.Add(sor);
                }
            }
            catch (FileNotFoundException)
            {
                Console.WriteLine("Fájl nem található!!!");
            }
            catch (IOException)
            {
                Console.WriteLine("Fájl nem olvasható IO hiba miatt!!!");
            }
            finally
            {
                if (olvaso == null)
                {
                    olvaso.Close();
                }
            }

            return li;
        }

        public static List<int> ReadLinesAsInts(string input)
        {
            List<string> sorok = FileUtils.ReadLines(input);
            List<int> szamok;
            if (sorok.Count > 0)
            {
                szamok = sorok.Select(s => Convert.ToInt32(s)).ToList();
            }
            else
            {
                szamok = new List<int>();
            }

            return szamok;
        }
    }
}