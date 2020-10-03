public class Circle {
    private double r;

    public static int circleCount = 0;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
        if (r < 0.0) {
            this.r = 0.0;
        }
    }

    public double kerulet() {
        return 2 * this.r * Math.PI;
    }

    public double terulet() {
        return this.r * this.r * Math.PI;
    }

    public Circle(double r) {
        this.setR(r);
        Circle.circleCount++;
    }

    public boolean isLessThan(Circle other) {
        return this.r < other.getR();
    }
}
