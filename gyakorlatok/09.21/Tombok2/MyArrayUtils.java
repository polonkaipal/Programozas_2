public class MyArrayUtils {
    public static void reverse(int[] tomb) {
        int i = 0, j = tomb.length - 1;
        while (i < j) {
            int temp = tomb[i];
            tomb[i] = tomb[j];
            tomb[j] = temp;
            i++;
            j--;
        }
    }
}
