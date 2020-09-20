import java.util.Scanner;

public class Main {

    public static double kerulet(double r) {
        return 2 * r * Math.PI;
    }

    public static double terulet(double r) {
        return r * r * Math.PI;
    }

    public static void main(String[] args) {
        System.out.print("Add meg a sugarat: ");
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();

        System.out.println("Kör kerülete: " + kerulet(r));
        System.out.println("Kör területe: " + terulet(r));

    }
}