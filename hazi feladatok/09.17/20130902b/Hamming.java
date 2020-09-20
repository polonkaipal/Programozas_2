public class Hamming {
    private String word;

    public String getWord() {
        return this.word;
    }

    public int getDistance(Hamming other) {
        if (this.word.length() != other.word.length()) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (this.word.charAt(i) != other.word.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public Hamming(String word) {
        this.word = word;
    }
}
