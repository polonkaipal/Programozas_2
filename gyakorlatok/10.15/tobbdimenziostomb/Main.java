import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = { { 2, 3 }, { 5, 8 }, { 7, 1 } };

        System.out.println(matrix);
        System.out.println(Arrays.toString(matrix));
        System.out.println(Arrays.deepToString(matrix)); // így a jó
    }
}
