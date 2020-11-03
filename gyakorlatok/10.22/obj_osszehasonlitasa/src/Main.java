public class Main {

    public static void main(String[] args) {
        Point2D p1 = new Point2D(2, 5);
        Point2D p2 = new Point2D(2, 5);

        System.out.println(p1);
        System.out.println(p1.hashCode());

        System.out.println(p2);
        System.out.println(p2.hashCode());

        System.out.println(p1 == p2);         // false, mert különbözik a memmória címük (ez a tartalmuk)
        System.out.println("-".repeat(25));
        System.out.println(p1.equals(p2));    // true, mert felülírtuk a helyes megoldásra (nem a címüket nézzük)
        System.out.println(p1.equals(p1));    // true, mert önmaga
    }
}
