public class StringUtils {
    public static char swap(char c) {
        if (Math.random() < 0.5) {
            return Character.toLowerCase(c);
        } else {
            return Character.toUpperCase(c);
        }
    }

    public static String randomCase(String s) {
        char[] betuk = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            betuk[i] = swap(s.charAt(i));
        }
        return new String(betuk);
    }
}
