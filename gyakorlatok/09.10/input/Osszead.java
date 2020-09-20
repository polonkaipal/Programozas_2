import java.util.Scanner;

public class Osszead {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.print("a: ");
        a = scan.nextInt();
        System.out.print("b: ");
        b = scan.nextInt();

        System.out.println("Összegük: " + (a + b));
        scan.close();
    }
}
