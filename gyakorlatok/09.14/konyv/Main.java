public class Main {
    public static void main(String[] args) {
        Konyv uj = new Konyv("Cím", "Szerző", 300);
        /*
         * uj.cim = "Cím"; uj.szerzo = "Szerző"; uj.oldalszam = 300;
         */

        Konyv uj2 = new Konyv("Cím2", "Szerző2", 255);
        /*
         * uj2.cim = "Cím2"; uj2.szerzo = "Szerző2"; uj2.oldalszam = 255;
         */

        System.out.printf("%s:%s - %d\n", uj.cim, uj.szerzo, uj.oldalszam);
        System.out.printf("%s:%s - %d\n", uj2.cim, uj2.szerzo, uj2.oldalszam);
    }
}