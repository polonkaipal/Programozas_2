import java.util.Arrays;

/*
Több érték visszaadása

Gondolkodjunk el azon, hogy egy metódusból hogyan lehetne több értéket is visszaadni.

A) Mi a helyzet, ha több azonos típusú elemet szeretnénk visszaadni?

B) Mi a helyzet, ha különböző típusú elemeket szeretnénk visszaadni?

A helyzet ugyanaz, mint C-ben: egy metódus (függvény) csak egy (1) darab értéket adhat vissza.
Vagyis trükközni kell.
*/
public class Main {
    public static int[] egyTolOtig() {
        return new int[] { 1, 2, 3, 4, 5 };
    }

    public static Konyv egyUjKonyv() {
        return new Konyv("Cím", "Szerző", 300);
    }

    public static void main(String[] args) {
        // A) eset
        int[] tomb1 = egyTolOtig();
        System.out.println(Arrays.toString(tomb1));
        System.out.println("-".repeat(25));

        // B) eset
        Konyv uj = egyUjKonyv();
        System.out.println(uj);
    }
}
