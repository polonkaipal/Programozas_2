import java.util.Random;

public class SzoGenerator {
    private static String betuk = "abc";
    private static String szamok = "0123456789";

    public static void general(final int sor, final int oszlop) {
        if (sor < 0 || oszlop < 0) {
            return;
        }
        Random r = new Random();
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                System.out.printf("%c%c%c", betuk.charAt(r.nextInt(3)), szamok.charAt(r.nextInt(10)),
                        j + 1 < sor ? ' ' : '\n');
            }
        }
    }
}
