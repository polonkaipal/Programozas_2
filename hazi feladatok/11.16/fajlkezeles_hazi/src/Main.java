import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        // Paraméterek számának ellenőrzése
        if (args.length != 2) {
            System.err.println("Nincs meg a szükséges két paraméter!");
            System.exit(1);
        }

        // Kimeneti fájl meglétének ellenőrzése
        File kimenet = new File("out.txt");
        // Ha létezik, akkor dob egy kivételt
        if (kimenet.exists()) {
            try {
                throw new AFajlMarLetezikException();
            } catch (AFajlMarLetezikException e) {
                System.err.println("Az írandó fájl már létezik!");
                System.exit(3);
            }
        }

        // Másolás
        try (BufferedReader br = new BufferedReader(new FileReader("in.txt"));
             PrintWriter iro = new PrintWriter(kimenet, StandardCharsets.UTF_8)
        ) {
            String sor;
            while ((sor = br.readLine()) != null) {
                iro.println(sor);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Az olvasandó fájl nem található");
            System.exit(2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("A program sikeresen lefutott");
    }
}
