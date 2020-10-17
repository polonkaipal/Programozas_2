public class V2 {
    public static void main(String[] args) {
        final int N = Integer.parseInt(FileUtils.readLines("config.txt").get(0).replace("_", ""));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(i);
        }
        System.out.println(sb.length());
    }
}
