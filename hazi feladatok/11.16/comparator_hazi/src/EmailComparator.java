import java.util.Comparator;

public class EmailComparator implements Comparator<User> {

    @Override
    public int compare(User u1, User u2) {
        return u1.getEmail().compareTo(u2.getEmail());
    }
}
