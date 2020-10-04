/*
sztringben lévő számjegyek összege

Legyen addott egy sztring, amiben egy egész számot tárolunk:
String s = "90146852";

Mennyi a számjegyek összege? Az eredmény megállapítására írjon egy metódust!

Kérdés

Nézze meg a Character wrapper osztály API dokumentációját! Van benne olyan metódus, amit fel tudna
használni?

Tegyük fel, hogy a ZH-n nem jut eszünkbe a Character osztály használata. Stressz alatt megesik az
ilyesmi. Hogyan oldaná meg a fenti feladatot másképpen? Javasoljon két alternatív megoldást is a
Character osztály használata helyett!
*/
public class Main {
    public static int szamjegyekOsszege(String s) {
        int osszeg = 0;
        for (char c : s.toCharArray()) {
            osszeg += Character.digit(c, 10);
        }
        return osszeg;
    }

    public static void main(String[] args) {
        String s = "90146852";
        int osszeg = szamjegyekOsszege(s);
        System.out.printf("%s számjegyeinek összege: %d\n", s, osszeg);
    }
}
