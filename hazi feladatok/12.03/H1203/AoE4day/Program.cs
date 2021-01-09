using System;
using System.Collections;
using System.Collections.Generic;
using Fajlkezeles;

namespace AoE4day
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
            List<Hashtable> adatok = new List<Hashtable>();
            Hashtable hs = new Hashtable();
            string[] sor;
            string[] tmp;
            int db = 0;
            foreach (var s in sorok)
            {
                if (s != "")
                {
                    sor = s.Split();
                    foreach (var e in sor)
                    {
                        tmp = e.Split(":");
                        if (tmp.Length > 1) hs.Add(tmp[0], tmp[1]);
                    }
                }
                else
                {
                    adatok.Add(hs);
                    hs = new Hashtable();
                }
            }

            adatok.Add(hs);

            foreach (var adat in adatok)
            {
                if (IsValid(adat))
                {
                    if (adat.Keys.Count == 8)
                    {
                        db++;
                    }
                    else if (adat.Keys.Count == 7 && !adat.ContainsKey("cid"))
                    {
                        db++;
                    }
                }
            }

            Console.WriteLine("Érvényes útlevelek: {0}", db);
        }

        private static bool IsValid(Hashtable adat)
        {
            bool byr = false;
            bool iyr = false;
            bool eyr = false;
            bool hgt = false;
            bool hcl = false;
            bool ecl = false;
            bool pid = false;

            foreach (var key in adat.Keys)
            {
                int ev;
                string magassag;
                int m;
                string hajszin;
                string szemszin;
                string azonosito;
                switch (key)
                {
                    case "byr":
                        ev = Convert.ToInt32(adat["byr"]);
                        if (ev >= 1920 && ev <= 2002)
                        {
                            byr = true;
                        }

                        break;

                    case "iyr":
                        ev = Convert.ToInt32(adat["iyr"]);
                        if (ev >= 2010 && ev <= 2020)
                        {
                            iyr = true;
                        }

                        break;

                    case "eyr":
                        ev = Convert.ToInt32(adat["eyr"]);
                        if (ev >= 2020 && ev <= 2030)
                        {
                            eyr = true;
                        }

                        break;

                    case "hgt":
                        magassag = (string) adat["hgt"];
                        if (magassag.Contains("in"))
                        {
                            m = Convert.ToInt32(magassag[..^2]);
                            if (m >= 59 && m <= 76)
                            {
                                hgt = true;
                            }
                        }
                        else if (magassag.Contains("cm"))
                        {
                            m = Convert.ToInt32(magassag[..^2]);
                            if (m >= 150 && m <= 193)
                            {
                                hgt = true;
                            }
                        }

                        break;

                    case "hcl":
                        hajszin = (string) adat["hcl"];
                        if (hajszin.Length == 7)
                        {
                            if (hajszin[0] == '#')
                            {
                                if (IsValidHairColor(hajszin[1..]))
                                {
                                    hcl = true;
                                }
                            }
                        }

                        break;

                    case "ecl":
                        szemszin = (string) adat["ecl"];
                        if (IsValidEyeColor(szemszin))
                        {
                            ecl = true;
                        }

                        break;

                    case "pid":
                        azonosito = (string) adat["pid"];
                        if (IsValidPid(azonosito))
                        {
                            pid = true;
                        }

                        break;
                }
            }

            return byr && iyr && eyr && hgt && hcl && ecl && pid;
        }

        private static bool IsValidPid(string azonosito)
        {
            foreach (var c in azonosito)
            {
                if (!char.IsDigit(c))
                {
                    return false;
                }
            }

            return true;
        }

        private static bool IsValidEyeColor(string szemszin)
        {
            List<string> ervenyesek = new List<string> {"amb", "blu", "brn", "gry", "grn", "hzl", "oth"};
            return ervenyesek.Contains(szemszin);
        }

        private static bool IsValidHairColor(string color)
        {
            List<char> ervenyesek = new List<char>
                {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            foreach (var c in color)
            {
                if (!ervenyesek.Contains(c))
                {
                    return false;
                }
            }

            return true;
        }

        private static void feladat_1()
        {
            List<string> sorok = FileUtils.ReadLines("input.txt");
            List<Hashtable> adatok = new List<Hashtable>();
            Hashtable hs = new Hashtable();
            string[] sor;
            string[] tmp;
            int db = 0;
            foreach (var s in sorok)
            {
                if (s != "")
                {
                    sor = s.Split();
                    foreach (var e in sor)
                    {
                        tmp = e.Split(":");
                        if (tmp.Length > 1) hs.Add(tmp[0], tmp[1]);
                    }
                }
                else
                {
                    adatok.Add(hs);
                    hs = new Hashtable();
                }
            }

            adatok.Add(hs);

            foreach (var adat in adatok)
            {
                if (adat.Keys.Count == 8)
                {
                    db++;
                }
                else if (adat.Keys.Count == 7 && !adat.ContainsKey("cid"))
                {
                    db++;
                }
            }

            Console.WriteLine("Érvényes útlevelek: {0}", db);
        }
    }
}