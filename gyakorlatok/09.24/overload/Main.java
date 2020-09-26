class Proba {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Proba p = new Proba();
        System.out.println(p.add(4, 5));
        System.out.println(p.add(4.5, 2.5));
    }
}