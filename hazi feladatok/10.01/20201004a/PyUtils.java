import java.util.Scanner;

public class PyUtils {
    public static String input(String s) {
        System.out.print(s);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static String input() {
        return input("");
    }

    private PyUtils() {
    }
}
