import java.util.Scanner;

public class Main {

    public static double kerulet(double a, double b) {
        return 2 * (a + b);
    }

    public static double terulet(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.print("Add meg a teglalap egyik oldalát: ");
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        System.out.print("Add meg a teglalap másik oldalát: ");
        double b = s.nextDouble();

        System.out.println("Kör kerülete: " + kerulet(a, b));
        System.out.println("Kör területe: " + terulet(a, b));

    }
}