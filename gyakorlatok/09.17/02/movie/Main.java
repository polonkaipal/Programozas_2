public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("The Terminator", 1984, 8.0);
        Movie m2 = new Movie("Start Wars V", 1980, 8.7);
        Movie m3 = new Movie("Bloodshot", 2020, 15.7);

        // m3.setScore(-15.1);
        // System.out.println(m3.getScore());

        // System.out.println(m1.toString());
        // csak az objektum megadásakor automatikusan meghívja a toSring() metódust, ha
        // létezik
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}