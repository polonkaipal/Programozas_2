public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User(" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ')';
    }
}
