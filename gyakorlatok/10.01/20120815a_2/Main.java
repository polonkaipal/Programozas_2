// import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(args));
        if (args.length != 2) {
            System.out.println("Nem 2 argumentum van megadva!!!");
            System.exit(1);
        } else {
            System.out.printf("%d + %d = %d\n", Integer.parseInt(args[0]), Integer.parseInt(args[1]),
                    Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
        }

    }
}
