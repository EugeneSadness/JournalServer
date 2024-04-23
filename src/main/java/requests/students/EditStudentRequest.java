package requests.students;

public class EditStudentRequest {
    private Long id;
    private String lastName;
    private String firstName;
    private String middleName;
    private Long groupId;
    private String status;

    public EditStudentRequest(Long id, String lastName, String firstName, String middleName, Long groupId, String status) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.groupId = groupId;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Long getGroupId() {
        return groupId;
    }

    public String getStatus() {
        return status;
    }
}
