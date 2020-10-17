import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final int N = 5;
    private static final int MAX = 99;

    public static void feltolt(int[][] m) {
        Random r = new Random(2020);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = r.nextInt(MAX);
            }
        }
    }

    public static void kiir(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
    }

    // Ha nem szabályos a mátrix, akkor 0-t ad vissza.
    public static int atlokOsszege(int[][] m) {
        int osszeg = 0;
        if (m.length == m[0].length) {
            for (int i = 0; i < m.length; i++) {
                osszeg += m[i][i];
                osszeg += m[i][m.length - 1 - i];
            }
        }
        return osszeg;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[N][N];
        feltolt(matrix);
        System.out.println("A mátrix tartalma:");
        kiir(matrix);
        System.out.println();
        System.out.println("A főátló és a mellékátló összege: " + atlokOsszege(matrix));
    }
}
