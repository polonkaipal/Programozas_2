public class MyUtils {
    public final static double PI = Math.PI;

    public static int duplaz(int n) {
        return 2 * n;
    }

    public static int strlen(String s) {
        return s.length();
    }

    // Példányosítás megszűntetése
    // Minden statikus az osztályon belül
    private MyUtils() {
    }
}