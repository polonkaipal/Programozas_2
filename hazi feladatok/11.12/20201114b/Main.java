import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        List<String> sorok = FileUtils.readLines("input.txt");
        Map<String, Integer> m = new HashMap<String, Integer>();
        for (String sor : sorok) {
            String[] reszek = sor.split(" ");
            for (String szo : reszek) {
                m.put(szo, m.getOrDefault(szo, 0) + 1);
            }
        }
        String maxKulcs = "";
        int maxErtek = Integer.MIN_VALUE;
        for (Entry<String, Integer> e : m.entrySet()) {
            System.out.printf("%s: %d\n", e.getKey(), e.getValue());
            if (e.getValue() > maxErtek) {
                maxKulcs = e.getKey();
                maxErtek = e.getValue();
            }
        }
        System.out.println("\nA leggyakoribb szó: " + maxKulcs);
    }
}
