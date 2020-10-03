import java.util.ArrayList;
import java.util.List;

public class PyUtils {

    public static List<Integer> range(int kezdo, int veg, int lepeskoz) {
        List<Integer> uj = new ArrayList<Integer>();
        for (int i = kezdo; i < veg; i += lepeskoz) {
            uj.add(i);
        }
        return uj;
    }

    public static List<Integer> range(int veg) {
        return range(0, veg, 1);
    }

    public static List<Integer> range(int kezdo, int veg) {
        // return range(kezdo, veg);
        return range(kezdo, veg, 1);
    }

    // Csak statikus osztály
    private PyUtils() {
    }
}
