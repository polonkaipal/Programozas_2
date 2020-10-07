import java.util.Arrays;
import java.util.List;

public class Jelszo {
    static List<Character> specKarakterek = Arrays.asList('.', ',', ':', ';');

    public static boolean isStrong(String szo) {
        boolean kisbetu = false, nagybetu = false, ketSzam = false, specialisKarakter = false;
        int db = 0;
        for (int i = 0; i < szo.length(); i++) {
            if (!kisbetu && Character.isLowerCase(szo.charAt(i))) {
                kisbetu = true;
                continue;
            }
            if (!nagybetu && Character.isUpperCase(szo.charAt(i))) {
                nagybetu = true;
                continue;
            }
            if (!specialisKarakter && specKarakterek.contains(szo.charAt(i))) {
                specialisKarakter = true;
                continue;
            }
            if (db < 2 && Character.isDigit(szo.charAt(i))) {
                db++;
            }
        }
        if (db >= 2) {
            ketSzam = true;
        }
        // még nincs kész

        return kisbetu && nagybetu && ketSzam && specialisKarakter;
    }

    public static void main(String[] args) {
        List<String> sorok = FileUtils.readLines("passwords.txt");
        int total = 0;
        for (String sor : sorok) {
            if (isStrong(sor)) {
                total++;
            }
        }
        System.out.println(total);
    }
}
