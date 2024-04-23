package entities;

public class Teacher {

    private long id;
    private String Firstname;
    private String SecondName;
    private String LastName;

    public Teacher(long id, String firstname, String secondName, String lastName) {
        this.id = id;
        Firstname = firstname;
        SecondName = secondName;
        LastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getSecondName() {
        return SecondName;
    }

    public String getLastName() {
        return LastName;
    }
}
