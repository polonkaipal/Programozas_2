public class V2 { // Gyors
    private final static int N = 100_000;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < N + 1; i++) {
            sb.append(i);
        }
        System.out.println(sb.length());
    }
}