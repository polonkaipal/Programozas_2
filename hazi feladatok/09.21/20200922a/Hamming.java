public class Hamming {
    public static int distance(String w1, String w2) {
        if (w1.length() != w2.length()) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < w1.length(); i++) {
            if (w1.charAt(i) != w2.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    private Hamming() {
    }
}
