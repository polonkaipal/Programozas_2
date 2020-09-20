import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg a kör sugarát: ");
        double r = sc.nextDouble();

        Circle c1 = new Circle(r);

        System.out.printf("A megadott kör kerülete: %.2f\n", c1.kerulet());
        System.out.printf("A megadott kör területe: %.2f\n", c1.terulet());

        sc.close();
    }
}
