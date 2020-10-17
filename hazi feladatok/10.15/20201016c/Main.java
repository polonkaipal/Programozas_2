import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fname = "day01.txt";
        List<Integer> digits = FileUtils.readFirstLineAsDigits(fname);
        // System.out.println(digits);
        int osszeg = 0;
        for (Integer szam : digits) {
            osszeg += szam;
        }
        System.out.println("Számjegyek összege: " + osszeg);
    }
}
