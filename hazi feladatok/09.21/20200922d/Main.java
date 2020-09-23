/*
Műveletek tömbökön

Gyakorlaton láttuk a következő metódusokat:

Arrays.equals(<tömb1>, <tömb2>);

Arrays.fill(<tömb>, <érték>);

Arrays.sort(<tömb>);

Gyakorlásképpen írjuk meg mi is ezeket a metódusokat manuálisan! Készítsünk egy MyArrayUtils nevű
osztályt, s azon belül implementáljuk a fenti metódusokat. A saját metódusokon belül természetesen
nem használhatjuk az Arrays osztályt. Vagyis a feladat az, hogy ha nem létezne az Arrays osztály a
standard könyvtárban, akkor hogyan írnánk meg ezeket a metódusokat.

Példa:

boolean result = MyArrayUtils.equals(<tömb1>, <tömb2>);

Ez például összehasonlítja a két tömb elemeit.

A metódusok pontos specifikációját megtaláljuk az Arrays osztály dokumentációjában:
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html .
*/
public class Main {
    public static void main(String[] args) {
        int[] tomb1 = { 1, 2, 3, 4, 5 };
        int[] tomb2 = { 1, 2, 3, 4, 5 };
        System.out.println("-".repeat(25));
        System.out.printf("%s\n", MyArrayUtils.toString(tomb1));
        System.out.printf("%s\n\n", MyArrayUtils.toString(tomb2));
        boolean result = MyArrayUtils.equals(tomb1, tomb2);
        if (result) {
            System.out.println("A két tömb megegyezik!");
        } else {
            System.out.println("A két tömb nem egyezik meg!");
        }
        System.out.println("-".repeat(25));

        int[] tomb3 = new int[10];
        System.out.printf("Tömböt feltölt %d értékekkel:\n", 5);
        MyArrayUtils.fill(tomb3, 5);
        System.out.println(MyArrayUtils.toString(tomb3));
        System.out.println("-".repeat(25));

        int[] tomb4 = { 5, 3, 2, 1, 4 };
        System.out.printf("Rendezés előtt:\n%s\n\n", MyArrayUtils.toString(tomb4));
        MyArrayUtils.sort(tomb4, 0, tomb4.length - 1);
        System.out.printf("Rendezés után:\n%s\n", MyArrayUtils.toString(tomb4));
        System.out.println("-".repeat(25));
    }
}
