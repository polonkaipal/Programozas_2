import java.util.Arrays;

public class MyArrayUtils {
    public static void sortDescending(int[] tomb) {
        Arrays.sort(tomb);
        int i = 0, j = tomb.length - 1;
        while (i < j) {
            int tmp = tomb[i];
            tomb[i] = tomb[j];
            tomb[j] = tmp;
            i++;
            j--;
        }
    }

    private MyArrayUtils() {
    }
}
