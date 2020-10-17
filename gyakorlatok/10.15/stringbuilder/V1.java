public class V1 { // Naiv változat
    private final static int N = 100_000;

    public static void main(String[] args) {
        String result = "";
        for (int i = 1; i < N + 1; i++) {
            result += i;
        }
        System.out.println(result.length());
    }
}