import java.util.Scanner;

/*
Kör

Írjunk egy Circle nevű osztályt, amit a következőképpen akarunk használni (példa):
Circle circle = new Circle(2.5);    // a konstruktornak a sugár hosszát adjuk át
double k = circle.kerulet();
double t = circle.terulet();

Írjunk programot, ami a felhasználótól bekéri a kör sugarának a hosszát (mint valós számot),
majd írjuk ki a kör kerületét, területét.

Mind a bevitelt, mind a kiíratást informatív módon végezzük el! Vagyis tájékoztassuk a felhasználót,
hogy mit kérünk be tőle! A kiíratásnál az eredmény ne csak egy szám legyen!

Tippek

1) Math.PI

2) Ha a bevitelnél a tizedespont esetén hibát kapunk, akkor próbálkozzunk a tizedesvesszővel.
Magyar operációs rendszer esetén előfordulhat, hogy a magyar területi beállítások miatt csak a
tizedesvesszőt fogadja el.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg a kör sugarát: ");
        double r = sc.nextDouble();

        Circle c1 = new Circle(r);

        System.out.printf("A megadott kör kerülete: %.2f\n", c1.kerulet());
        System.out.printf("A megadott kör területe: %.2f\n", c1.terulet());

        sc.close();
    }
}
