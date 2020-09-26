import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> szamok = new ArrayList<Integer>();
        List<Integer> masik = new ArrayList<Integer>();
        masik.add(100);
        masik.add(200);

        System.out.println(szamok);

        szamok.add(3);
        szamok.add(6);
        szamok.add(8);
        szamok.addAll(masik);

        System.out.println(szamok);

        for (int n : szamok) {
            System.out.println(n);
        }

        // vagy
        System.out.println("-".repeat(25));

        for (int i = 0; i < szamok.size(); i++) {
            System.out.println(szamok.get(i));
        }
    }
}