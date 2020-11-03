public class Main {
    public static void main(String[] args) {
        System.out.println(product()); // 1
        System.out.println(product(2)); // 2
        System.out.println(product(2, 5)); // 10
        System.out.println(product(2, 5, 10)); // 100
        System.out.println(product(2, 5, 10, 3)); // 300
    }

    public static int product(int... elems) {
        int p = 1;
        if (elems.length == 0) {
            return p;
        }
        for (int e : elems) {
            p *= e;
        }
        return p;
    }
}
