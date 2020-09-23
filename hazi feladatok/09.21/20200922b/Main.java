/*
Math osztály

A Math osztály dokumentációja: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html

Nézze át az osztály metódusait és válasszon ki 5 darab szimpatikus metódust. Írjon egy programot,
amiben demonstrálja ezen metódusok működését.

A program szövegesen tájékoztassa a felhasználót arról, hogy mi is történik, melyik metódust mutatja
be éppen. A képernyőn az egyes eseteket válassza el egy vízszintes vonallal a könnyebb
áttekinthetőség kedvéért.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("-".repeat(25));
        // 1. - Abszolútérték függvény
        int a = -10, b = 20;
        System.out.printf("%+d abszolút értéke: %d\n", a, Math.abs(a));
        System.out.printf("%+d abszolút értéke: %d\n", b, Math.abs(b));
        System.out.println("-".repeat(25));

        // 2. - Köbgyök függvény
        double db = 2.197;
        System.out.printf("%.3f köbgyöke: %.3f\n", db, Math.cbrt(db));
        System.out.println("-".repeat(25));

        // 3. - Alsó egészrész függvény
        double db2 = 2.9;
        System.out.printf("%.2f alsó egészrésze: %.0f\n", db2, Math.floor(db2));
        System.out.println("-".repeat(25));

        // 4. - Felső egészrész függvény
        double db3 = 2.3;
        System.out.printf("%.2f felső egészrésze: %.0f\n", db3, Math.ceil(db3));
        System.out.println("-".repeat(25));

        // 5. - 10-es alapú logaritmus függvény
        double db4 = 100;
        System.out.printf("%.0fx erősítés az %.2f dB\n", db4, 10 * Math.log10(db4));
        System.out.println("-".repeat(25));
    }
}
