public class Movie {
    private String title;
    private int year;
    private double score;

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
        if (score < 0.0) {
            this.score = 0.0;
        }
        if (score > 10.0) {
            this.score = 10.0;
        }
    }

    @Override
    public String toString() {
        return String.format("title: %s, year: %d, score: %.1f", this.title, this.year, this.score);
    }

    public Movie(String title, int year, double score) {
        this.title = title;
        this.year = year;
        this.setScore(score);
    }
}
