import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> eredeti = PyUtils.range(5);

        List<Integer> copy = new ArrayList<Integer>(eredeti);
        copy.set(0, 99);

        System.out.println(eredeti);
        System.out.println(copy);
        System.out.println("-".repeat(25));

        System.out.println(copy);
        Collections.rotate(copy, -2);
        System.out.println(copy);

        List<Integer> szamok = new ArrayList<>();
    }
}