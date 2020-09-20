import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg a téglalap egyik oldalát: ");
        int a = sc.nextInt();
        System.out.print("Add meg a téglalap másik oldalát: ");
        int b = sc.nextInt();

        System.out.printf("A téglalap kerülete: %d\n", 2 * (a + b));
        System.out.printf("A téglalap területe: %d\n", a * b);

        sc.close();
    }
}
