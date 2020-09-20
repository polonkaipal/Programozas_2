import java.util.Scanner;

/*
Négyzet

Írjunk egy Negyzet nevű osztályt, amit a következőképpen akarunk használni (példa):
Negyzet negyzet = new Negyzet(3);    // a konstruktornak a négyzet oldalának a hosszát adjuk át
int k = negyzet.kerulet();    // 12
int t = negyzet.terulet();    // 9

Írjunk programot, ami a felhasználótól bekéri a négyzet oldalának a hosszát (mint egész számot),
majd írjuk ki a négyzet kerületét, területét.

Mind a bevitelt, mind a kiíratást informatív módon végezzük el! Vagyis tájékoztassuk a felhasználót,
hogy mit kérünk be tőle! A kiíratásnál az eredmény ne csak egy szám legyen!
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg a négyzet oldalát: ");
        int a = sc.nextInt();

        Negyzet n1 = new Negyzet(a);

        System.out.printf("A megadott négyzet kerülete: %d\n", n1.kerulet());
        System.out.printf("A megadott négyzet területe: %d\n", n1.terulet());

        sc.close();
    }
}
