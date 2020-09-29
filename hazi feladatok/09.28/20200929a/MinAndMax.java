import java.util.Arrays;
import java.util.List;

public class MinAndMax {
    public int min;
    public int max;

    public MinAndMax(List<Integer> szamok) {
        this.min = szamok.get(0);
        this.max = szamok.get(0);
        for (Integer i : szamok) {
            if (i < this.min) {
                this.min = i;
            }
            if (i > this.max) {
                this.max = i;
            }
        }
    }

    public String toString() {
        return Arrays.toString(new int[] { this.min, this.max });
    }
}
