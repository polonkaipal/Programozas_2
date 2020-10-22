import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day2 {
    public static void main(String[] args) {
        //List<String> tablazat = FileUtils.readLines("day02.txt");
        List<String> tablazat = FileUtils.readLines("sajat.txt");
        int szum = 0;
        for (int i = 0; i < tablazat.size(); i++) {
            String[] reszek = tablazat.get(i).split("\t");
            List<Integer> szamok = new ArrayList<Integer>();
            for (int j = 0; j < reszek.length; j++) {
                szamok.add(Integer.parseInt(reszek[j]));
            }
            Collections.sort(szamok);
            Collections.reverse(szamok);
            for (int j = 0; j < szamok.size() - 1; j++) {
                for (int k = j + 1; k < szamok.size(); k++) {
                    int tmp1 = szamok.get(j);
                    int tmp2 = szamok.get(k);
                    if (tmp1 % tmp2 == 0) {
                        szum += tmp1 / tmp2;
                        continue;
                    }
                }
            }
        }
        System.out.println("A cheksum összege: " + szum);
    }
}
