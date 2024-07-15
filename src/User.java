public class User {
    @PrintField
    public String name;
    @PrintField
    public String surname;
    @PrintField
    public int age;
    @PrintField
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}