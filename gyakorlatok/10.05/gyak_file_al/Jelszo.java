import java.util.List;

public class Jelszo {
    static char[] specKarakterek = { '.', ',', ':', ';' };

    public static boolean isStrong(String szo) {
        boolean kisbetu = false, nagybetu = false, ketSzam = false, specialisKarakter = false;
        int db = 0;
        for (char k : szo.toCharArray()) {
            if (!kisbetu && Character.isLowerCase(k)) {
                kisbetu = true;
            }
            if (!nagybetu && Character.isUpperCase(k)) {
                nagybetu = true;
            }
            if (db < 2 && Character.isDigit(k)) {
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
