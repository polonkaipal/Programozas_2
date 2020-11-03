import java.util.Random;

public class RandUtils {
    private final static Random rand = new Random();

    public static int randInt(int also, int felso) {
        return also + rand.nextInt(felso - also + 1);
    }
}
