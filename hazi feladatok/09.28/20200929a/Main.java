import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
több érték visszaadása

Több érték visszaadására több módszert is átbeszéltünk:

    több elem visszaadása tömbben
    több elem visszaadása listában
    több elem visszaadása egy saját objektumban

Mi az egyes megoldások előnye / hátránya? Gondolkodjunk el ezen!

Feladat

Tekintsük az alábbi kódot:
List<Integer> szamok = new ArrayList<Integer>(List.of(5, 6, 3, 9, 4, 2, 7, 99));
szamok.add(1);

System.out.println(szamok);    // [5, 6, 3, 9, 4, 2, 7, 99, 1]

Mint látható, ezzel a módszerrel egyszerűen tudunk inicializálni egy ArrayList objektumot.
(A másik [hosszabb és fárasztóbb] módszer az lenne, hogy létrehozunk egy üres ArrayList objektumot,
s abba egyenként add-oljuk az elemeket.)

Figyelem! A List.of(…) egy immutable listát ad vissza! Azzal, hogy ezt az ArrayList konstruktorának
adtuk át, az eredmény egy ArrayList objektum lesz, amit a felsorolt elemekkel inicializáltunk.
Egy ArrayList objektum pedig módosítható.

A fenti szamok listát adjuk át egy metódusnak, ami adja vissza a lista legkisebb és legnagyobb
elemét! A fent említett három módszer mindegyikét próbáljuk ki!

Létezik a Collections.min() és a Collections.max(), de most a legkisebb és a legnagyobb elemet
keressük meg hagyományos módszerrel.
*/
public class Main {

    public static List<Integer> getMinAndMaxWithList(List<Integer> szamok) {
        MinAndMax mm = new MinAndMax(szamok);
        return List.of(mm.min, mm.max);
    }

    public static int[] getMinAndMaxWithArray(List<Integer> szamok) {

        MinAndMax mm = new MinAndMax(szamok);
        return new int[] { mm.min, mm.max };
    }

    public static void main(String[] args) {
        List<Integer> szamok = new ArrayList<Integer>(List.of(5, 6, 3, 9, 4, 2, 7, 99));
        szamok.add(1);

        System.out.println(szamok); // [5, 6, 3, 9, 4, 2, 7, 99, 1]

        // több elem visszaadása tömbben
        int[] minEsMaxTomb = getMinAndMaxWithArray(szamok);
        System.out.println(Arrays.toString(minEsMaxTomb));

        // több elem visszaadása listában
        List<Integer> minEsMaxLista = getMinAndMaxWithList(szamok);
        System.out.println(minEsMaxLista);

        // több elem visszaadása egy saját objektumban
        MinAndMax mm = new MinAndMax(szamok);
        System.out.println(mm);
    }

}
