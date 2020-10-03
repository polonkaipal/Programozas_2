public class Circle {
    double r;

    public double kerulet() {
        return 2 * r * Math.PI;
    }

    public double terulet() {
        return r * r * Math.PI;
    }

    public Circle(double r) {
        this.r = r;
    }
}
