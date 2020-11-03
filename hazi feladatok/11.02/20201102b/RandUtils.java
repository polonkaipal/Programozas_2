import java.util.List;
import java.util.Random;

public class RandUtils {
    private static final Random r = new Random();

    public static int randint(int also, int felso) {
        return also + r.nextInt(felso - also + 1);
    }

    public static int randrange(int also, int felso) {
        return randint(also, felso - 1);
    }

    public static int choice(List<Integer> li) {
        return li.get(randrange(0, li.size()));
    }
}
