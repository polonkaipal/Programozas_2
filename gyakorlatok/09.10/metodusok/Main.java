public class Main {
    public static int duplaz(int x) {
        return x * 2;
    }

    public static String udvozlet(String nev) {
        return "Hello " + nev + "!";
    }

    public static void main(String[] args) {
        System.out.println(duplaz(7));
        String text = udvozlet("Pali"); // Hello Pali!
        System.out.println(text);
    }
}