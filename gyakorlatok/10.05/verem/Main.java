public class Main {
    public static void main(String[] args) {
        Verem v1 = new Verem();
        System.out.println(v1);             // [
        System.out.println(v1.size());      // 0
        System.out.println(v1.isEmpty());   // true

        v1.push(1);
        v1.push(5);
        v1.push(7);
        System.out.println(v1);             // [1, 5, 7
        System.out.println(v1.size());      // 3
        System.out.println(v1.isEmpty());   // false

        int x = v1.pop();
        System.out.println(x);
        System.out.println(v1.size());      // 2
        System.out.println(v1);             // [1, 5

        Verem v2 = new Verem();
        v2.push(4);
        v2.push(6);
        System.out.println(v2);
    }
}
