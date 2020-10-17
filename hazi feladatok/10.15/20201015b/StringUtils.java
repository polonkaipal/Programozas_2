public class StringUtils {
    public static char swap(char c) {
        if (Math.random() < 0.5) {
            return Character.toLowerCase(c);
        } else {
            return Character.toUpperCase(c);
        }
    }

    public static String randomCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(swap(s.charAt(i)));
        }
        return new String(sb.toString());
    }
}
