import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String sor;                            // aktuális sorhoz
        String[] reszek;                       // sor szavai
        List<String> tmp = new ArrayList<>();  // sor szavainak ideiglenes tárolása a vizsgálathoz
        int db = 0;                            // számláló
        try (BufferedReader br = new BufferedReader(new FileReader("day04.txt"))) {
            while ((sor = br.readLine()) != null) {
                reszek = sor.split((" "));
                for (String szo : reszek) {
                    if (tmp.contains(szo)) {
                        break;
                    } else {
                        tmp.add(szo);
                    }
                }
                if (reszek.length == tmp.size()) {
                    db++;
                }
                tmp.clear();
            }
        } catch (FileNotFoundException e) {
            System.err.println("Az olvasandó fájl nem található!");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Egyéb hiba: lásd a hívási láncot!");
            e.printStackTrace();
            System.exit(2);
        }

        System.out.println("Összes érvényes jelmondat: " + db);
    }
}
