/*
Ezernél kisebb pozitív egész számok (PE #1)

Ha felsoroljuk a 10-nél kisebb pozitív egész számokat, melyek 3-nak vagy 5-nek a többszörösei,
akkor a köv. számokat kapjuk: 3, 5, 6 és 9. Ezek összege 23.

Állapítsuk meg azon 1000-nél kisebb számok összegét, melyek 3-nak vagy 5-nek a többszörösei.
*/
public class Main {
    public static int lessThanSum(int x) {
        int sum = 0;
        for (int i = 3; i < x; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int x = 1000;
        int sum = lessThanSum(x);
        System.out.printf("A(z) %d-nál/nél kisebb, 3-mal és 5-tel oszható számok összege: %d\n", x, sum);
    }
}
