public class MyArrayUtils {
    public static String toString(int[] tomb) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tomb.length; i++) {
            sb.append(String.format("%d, ", tomb[i]));
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }

    public static boolean equals(int[] tomb1, int[] tomb2) {
        if (tomb1.length != tomb2.length) {
            return false;
        }
        for (int i = 0; i < tomb2.length; i++) {
            if (tomb1[i] != tomb2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void fill(int[] tomb1, int ertek) {
        for (int i = 0; i < tomb1.length; i++) {
            tomb1[i] = ertek;
        }
    }

    public static void sort(int[] tomb1, int bal, int jobb) {
        int x, temp;
        int i, j;

        i = bal;
        j = jobb;
        x = tomb1[(bal + jobb) / 2];
        while (i <= j) {
            while (tomb1[i] < x)
                ++i;
            while (tomb1[j] > x)
                --j;
            if (i <= j) {
                temp = tomb1[i];
                tomb1[i] = tomb1[j];
                tomb1[j] = temp;
                /* */
                ++i;
                --j;
            }
        }

        if (bal < j)
            sort(tomb1, bal, j);
        if (i < jobb)
            sort(tomb1, i, jobb);
    }

    private MyArrayUtils() {
    }
}
