/*
Négyzetek összege, összeg négyzete (PE #6)

Az első tíz természetes szám négyzetösszege:

12 + 22 + … + 102 = 385

Az első tíz természetes szám összegének a négyzete:

(1 + 2 + … + 10)2 = 552 = 3025

Vagyis az első tíz természetes szám összegének a négyzete és az első tíz természetes szám
négyzetösszege közti különbség: 3025 − 385 = 2640.

Számítsuk ki az első száz természetes szám összegének a négyzete és az első száz természetes szám
négyzetösszege közti különbséget!
*/
public class Main {
    public static int kulonbsegNegyzet(int szam) {
        int negyzetosszeg = 0, osszeg = 0;
        for (int i = 1; i <= szam; i++) {
            negyzetosszeg += i * i;
            osszeg += i;
        }
        return osszeg * osszeg - negyzetosszeg;
    }

    public static void main(String[] args) {
        System.out.println(kulonbsegNegyzet(100));
    }
}
