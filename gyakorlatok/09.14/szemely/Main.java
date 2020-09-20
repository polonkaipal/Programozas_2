public class Main {
    public static void main(String[] args) {
        Personal p1 = new Personal("Anna", "anna@jhello.com", 1983);

        System.out.println("Name: " + p1.name);
        System.out.println("Életkor: " + p1.howOldAreYou());
    }
}