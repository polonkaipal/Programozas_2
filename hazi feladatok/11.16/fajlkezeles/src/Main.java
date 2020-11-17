import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        olvas_3();
        iras();
    }

    private static void iras() {
        try (PrintWriter writer = new PrintWriter("output.txt", StandardCharsets.UTF_8)
        ) {
            writer.println("The first line.");
            writer.println("The second line.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void olvas_3() {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
