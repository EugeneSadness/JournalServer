package entities;

public class Student {

    private long id;
    private long groupId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String status;

    public Student(long id, long groupId, String firstName, String lastName, String middleName, String status) {
        this.id = id;
        this.groupId = groupId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.status = status;
    }

    public Student(long id, String firstName, String lastName, String middleName, String status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.status = status;
        this.groupId = -1;
    }

    public long getId() {
        return id;
    }

    public long getGroupId() {
        return groupId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getStatus() {
        return status;
    }
}
