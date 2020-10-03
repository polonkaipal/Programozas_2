import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg a négyzet oldalát: ");
        int a = sc.nextInt();

        Negyzet n1 = new Negyzet(a);

        System.out.printf("A megadott négyzet kerülete: %d\n", n1.kerulet());
        System.out.printf("A megadott négyzet területe: %d\n", n1.terulet());

        sc.close();
    }
}
