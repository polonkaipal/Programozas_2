import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List<String> sorok = FileUtils.readLines("pelda.txt");
        List<String> sorok = FileUtils.readLines("input.txt");
        int sum = 0;
        for (String sor : sorok) {
            String[] reszek = sor.split(", ");
            int a = Integer.parseInt(reszek[0]);
            int b = Integer.parseInt(reszek[1]);
            if (a % b == 0) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
