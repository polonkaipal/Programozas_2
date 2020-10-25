public class Main {
    public static void main(String[] args) {
        String content = FileUtils.read("text.txt");
        System.out.println("'" + content + "'");
    }
}
