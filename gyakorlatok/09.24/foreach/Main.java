import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        int[] tomb = { 3, 6, 9 };
        for (int e : tomb) {
            System.out.println(e);
        }

        // tömb másolat
        int[] masolat = tomb.clone();
        masolat[0] = 30;

        System.out.println(Arrays.toString(tomb));
        System.out.println(Arrays.toString(masolat));

        System.out.println("-".repeat(25));

        // final referenciákra

        final int[] szamok = { 1, 2, 5 };
        System.out.println(Arrays.toString(szamok));
        szamok[0] = 100; // lefut
        System.out.println(Arrays.toString(szamok));
    }
}