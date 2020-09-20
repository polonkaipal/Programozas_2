import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg a kör sugarát: ");
        double r = sc.nextDouble();

        System.out.printf("A kör kerülete: %.2f\n", 2 * r * Math.PI);
        System.out.printf("A kör területe: %.2f\n", r * r * Math.PI);

        sc.close();
    }
}
