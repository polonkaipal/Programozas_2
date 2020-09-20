public class Main {
    public static void main(String[] args) {
        boolean ok = true;

        System.out.println(ok);

        String name = "Joe";
        String profession = "hacker";
        int age = 22;

        // System.out.println(name + " " + "(" + profession + "), " + age);
        System.out.printf("%s (%s), %d\n", name, profession, age);

        String result = String.format("%s (%s), %d", name, profession, age);
        System.out.println(result);

        System.out.println("-".repeat(30));
        System.out.println("Új cucc");
    }
}