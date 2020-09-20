import java.util.Scanner;

/*
Téglalap

Írjunk egy programot, ami a felhasználótól bekéri egy téglalap oldalainak a hosszát (egész értékek).
Írjuk ki a képernyőre a téglalap kerületét és területét.

Mind a beolvasásnál, mind a kiíratásnál informatív módon tájékoztassuk a felhasználót!
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg a téglalap egyik oldalát: ");
        int a = sc.nextInt();
        System.out.print("Add meg a téglalap másik oldalát: ");
        int b = sc.nextInt();

        System.out.printf("A téglalap kerülete: %d\n", 2 * (a + b));
        System.out.printf("A téglalap területe: %d\n", a * b);

        sc.close();
    }
}
