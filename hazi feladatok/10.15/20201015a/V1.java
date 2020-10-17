public class V1 {
    public static void main(String[] args) {
        final int N = Integer.parseInt(FileUtils.readLines("config.txt").get(0).replace("_", ""));
        String s = "";
        for (int i = 1; i <= N; i++) {
            s += i;
        }
        System.out.println(s.length());
    }
}
