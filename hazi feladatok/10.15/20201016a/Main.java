import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> szavak = FileUtils.readLines("words_alpha.txt");
        int db = 0;
        for (String szo : szavak) {
            if (StringUtils.isPalindrome(szo)) {
                db++;
            }
        }
        System.out.println("Palindrom szavak száma: " + db);
        System.out.printf("A kapott szám %spalindrom!\n", StringUtils.isPalindrome(Integer.toString(db)) ? "" : "nem ");
    }
}
