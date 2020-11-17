import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("bela", 20, "bela@contoso.com"));
        users.add(new User("aladar", 18, "aladar@contoso.com"));
        users.add(new User("denes", 16, "denes@contoso.com"));
        users.add(new User("cecil", 15, "cecil@contoso.com"));

        System.out.println(users);
        // Collections.sort(users, new EmailComparator());
        users.sort(new EmailComparator());
        System.out.println(users);
    }
}
