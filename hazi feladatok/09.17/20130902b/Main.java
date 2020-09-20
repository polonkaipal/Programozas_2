/*
Hamming-távolság

A Hamming-távolság alatt két azonos hosszúságú karaktersorozat eltérő karaktereinek a számát értjük.

Példa:

toned
^ ^ ^
ˇ ˇ ˇ
roses

A szavak a ^ˇ jelzett pozíciókban eltérnek, így a két szó Hamming-távolsága: 3.

Írjon egy függvényt, mely megállapítja a paraméterül kapott sztringek Hamming-távolságát.
*/
public class Main {
    public static void main(String[] args) {
        Hamming w1 = new Hamming("toned");
        Hamming w2 = new Hamming("roses");

        int distance = w1.getDistance(w2);
        if (distance != -1) {
            System.out.printf("A Hamming-távolsága a(z) '%s' és a(z) '%s' szónak: %d\n",
                               w1.getWord(), w2.getWord(), distance);
        } else {
            System.out.println("A két szó hossza nem egyezik meg!!!");
        }
    }
}
