import java.util.List;

public class Main {
    public static void main(String[] args) {
        int result = RandUtils.randint(70, 72);
        System.out.println(result);

        result = RandUtils.randrange(70, 72);
        System.out.println(result);

        List<Integer> szamok = List.of(1, 2, 3, 4, 5, 6);
        result = RandUtils.choice(szamok);
        System.out.println(result);
    }
}
