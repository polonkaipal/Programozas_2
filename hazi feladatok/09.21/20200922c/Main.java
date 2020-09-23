import java.util.Arrays;

/*
Rendezés csökkenő sorrendbe

int[] tomb = { 2, 5, 1, 4, 3 };

System.out.println(Arrays.toString(tomb));    // [2, 5, 1, 4, 3]

MyArrayUtils.sortDescending(tomb);

System.out.println(Arrays.toString(tomb));    // [5, 4, 3, 2, 1]

A MyArrayUtils osztályunkon belül írjuk meg a sortDescending() metódust, mely a kapott tömböt
helyben rendezi csökkenő sorrendbe. (Ha ügyesek vagyunk, akkor 2 sorban megoldható a feladat.)
*/
public class Main {
    public static void main(String[] args) {
        int[] tomb = { 2, 5, 1, 4, 3 };

        System.out.println("Csökkenő-sorrendezés előtt:");
        System.out.println(Arrays.toString(tomb)); // [2, 5, 1, 4, 3]

        MyArrayUtils.sortDescending(tomb);

        System.out.println("\nCsökkenő-sorrendezés után:");
        System.out.println(Arrays.toString(tomb)); // [5, 4, 3, 2, 1]
    }
}
