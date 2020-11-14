import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> szamok = List.of(5, 2, 3, 5, 1, 4, -200, 5, 1, 3, 2, 2, 5);
        szamok = new ArrayList<Integer>(new HashSet<Integer>(szamok));
        Collections.sort(szamok);
        System.out.println(szamok);
    }
}
