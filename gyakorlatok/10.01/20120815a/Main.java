import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Add meg az első számot: ");
        int a = Integer.parseInt(s.nextLine());
        System.out.print("Add meg a második számot: ");
        int b = Integer.parseInt(s.nextLine());
        System.out.printf("%d + %d = %d\n", a, b, a + b);

        s.close();
    }
}
