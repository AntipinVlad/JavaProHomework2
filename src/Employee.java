public class Employee {
    private String firstName;
    private String secondName;
    private String surname;
    private String position;
    private String email;
    private Long phoneNumber;
    private int age;

    public Employee(String firstName, String secondName, String surname, String position, String email, Long phoneNumber, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
}
