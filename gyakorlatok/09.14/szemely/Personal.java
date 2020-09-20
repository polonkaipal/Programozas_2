import java.util.Calendar;

public class Personal {
    String name;
    String email;
    int yearOfBirth;

    public int howOldAreYou() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - yearOfBirth;
    }

    public Personal(String name, String email, int yearOfBirth) {
        // System.out.println("# hopp, lefutott");
        this.name = name;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
    }
}
