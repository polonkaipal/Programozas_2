import java.util.Arrays;

public class Main {

    static void atad(int[] tomb) {
        tomb[0] = 100;
    }

    static int[] getOneToFive() {
        return new int[]{ 1, 2, 3, 4, 5 };
    }

    public static void main(String[] args) {
        int[] scores = new int[5]; // csupa 0 van benne

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        System.out.println("-".repeat(20));
        atad(scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        System.out.println("-".repeat(20));
        System.out.println(Arrays.toString(scores));

        System.out.println("-".repeat(20));
        int[] uj = getOneToFive(); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(uj));
    }
}