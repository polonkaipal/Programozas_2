import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi IntelliJ!");
        System.out.println(MyUtils.duplaz(5));
        System.out.println(Arrays.toString(args));
        ciklus();
        System.out.println("END");
    }

    private static void ciklus() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
