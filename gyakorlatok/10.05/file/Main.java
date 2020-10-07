import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> sorok = FileUtils.readLines("szoveg.txt");
        System.out.println(sorok);
    }
}
