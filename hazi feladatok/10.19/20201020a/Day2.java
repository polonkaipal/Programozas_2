import java.util.List;

public class Day2 {
    public static void main(String[] args) {
        //List<String> tablazat = FileUtils.readLines("day02.txt");
        List<String> tablazat = FileUtils.readLines("sajat.txt");
        int szum = 0;
        for (int i = 0; i < tablazat.size(); i++) {
            String[] reszek = tablazat.get(i).split("\t");
            int min = Integer.parseInt(reszek[0]);
            int max = Integer.parseInt(reszek[0]);
            for (int j = 1; j < reszek.length; j++) {
                int tmp = Integer.parseInt(reszek[j]);
                if (tmp < min) {
                    min = tmp;
                }
                if (tmp > max) {
                    max = tmp;
                }
            }
            szum += max - min;
        }
        System.out.println("A cheksum összege: " + szum);
    }
}
