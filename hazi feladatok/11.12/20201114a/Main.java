import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> sorok = FileUtils.readLines("input.txt");
        Set<String> h = new HashSet<String>();
        for (String sor : sorok) {
            String[] reszek = sor.split(" ");
            for (String szo : reszek) {
                h.add(szo);
            }
        }
        System.out.printf("Összesen: %d db szó van\n", h.size());
    }
}
