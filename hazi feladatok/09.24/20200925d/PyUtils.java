import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PyUtils {
    public static List<Integer> range(int veg) {
        List<Integer> uj = new ArrayList<Integer>();
        for (int i = 0; i < veg; i++) {
            uj.add(i);
        }
        return uj;
    }

    public static List<Integer> range(int kezdo, int veg) {
        List<Integer> uj = new ArrayList<Integer>();
        for (int i = kezdo; i < veg; i++) {
            uj.add(i);
        }
        return uj;
    }

    public static List<Integer> range(int kezdo, int veg, int lepeskoz) {
        List<Integer> uj = new ArrayList<Integer>();
        for (int i = kezdo; i < veg; i += lepeskoz) {
            uj.add(i);
        }
        return uj;
    }

    public static String toString(List<Integer> li) {
        return Arrays.toString(li.toArray());
    }

    // Csak statikus osztály
    private PyUtils() {
    }
}
