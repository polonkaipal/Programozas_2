/*
Hamming-távolság

A Hamming-távolság feladatnak (eredeti kiírás itt[https://arato.inf.unideb.hu/szathmary.laszlo/pmwiki/index.php?n=Py3.20130902b])
készítsük el egy olyan verzióját, ahol a hívó oldal a következőképpen néz ki:

int diff = Hamming.distance("toned", "roses");

Gondoskodjon arról, hogy a Hamming osztály ne legyen példányosítható!
*/
public class Main {
    public static void main(String[] args) {
        int diff = Hamming.distance("toned", "roses");
        if (diff == -1) {
            System.out.println("Nem egyenlő hosszúak a szavak!");
        } else {
            System.out.printf("Hamming távolság: %d\n", diff);
        }
    }
}
