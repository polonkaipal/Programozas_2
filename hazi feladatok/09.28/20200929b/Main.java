/*
wrapper classes

Gyakorlaton szó volt a csomagoló osztályokról:

A Java API dokumentációban nézzünk utána a következőknek: Character, Integer, Double, Boolean.
Nézzük meg, hogy milyen statikus metódusaik vannak. Osztályonként válasszunk ki két-két szimpatikus
metódust, s demonstráljuk a működésüket. (Vagyis 4 * 2 metódust kell bemutatni).

A program szövegesen tájékoztassa a felhasználót arról, hogy mi is történik, melyik metódust mutatja
be éppen. A képernyőn az egyes eseteket válassza el egy vízszintes vonallal a könnyebb
áttekinthetőség kedvéért.
*/
public class Main {
    public static int getSzamjegyekSzama(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Character
        System.out.println("-".repeat(25));
        System.out.println("Character:");
        // 1.
        System.out.println("- isDigit:");
        String s = "123_456_789";
        int szamjegyekSzama = getSzamjegyekSzama(s);
        System.out.printf("A számjegyek darabszáma a Stringben: %s -- > %d\n\n", s, szamjegyekSzama);

        // 2.
        System.out.println("- toUpperCase:");
        char betu = 'p';
        System.out.printf("Kisbetűből nagybetű: %c --> %c\n", betu, Character.toUpperCase(betu));
        System.out.println("-".repeat(25));

        // Integer
        System.out.println("Integer:");
        System.out.println("- rotateLeft:");
        // 1.
        int i = 11;
        System.out.printf("%d szorozva 8-al: %d\n\n", i, Integer.rotateLeft(i, 3));

        // 2.
        System.out.println("- toHexString:");
        int szam = 1999;
        System.out.printf("%d hexadecimális értéke: %s\n", szam, Integer.toHexString(szam));
        System.out.println("-".repeat(25));

        // Double
        System.out.println("Double:");
        // 1.
        System.out.println("- parseDouble:");
        String s1 = ".4";
        double d = Double.parseDouble(s1);
        System.out.printf("%s --> %.2f\n\n", s1, d);

        // 2.
        System.out.println("- isNaN:");
        System.out.printf("%.2f egy %svalódi szám\n", d, Double.isNaN(d) ? "nem " : "");
        System.out.println("-".repeat(25));

        // Boolean
        System.out.println("Boolean:");
        // 1.
        System.out.println("- parseBoolean:");
        String bs = "TrUe";
        System.out.printf("%s --> %b\n\n", bs, Boolean.parseBoolean(bs));

        // 2.
        System.out.println("- logicalOr:");
        boolean a = true, b = false;
        System.out.printf("%b or %b = %b\n", a, b, Boolean.logicalOr(a, b));
        System.out.println("-".repeat(25));
    }
}
