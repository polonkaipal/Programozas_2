public class Hello {

    public void start() {
        System.out.println("Ehh!");
        System.out.println(duplaz(6));
    }

    public int duplaz(int n) {
        return 2 * n;
    }

    public static void main(String[] args) {
        Hello h = new Hello();
        h.start();
    }
}