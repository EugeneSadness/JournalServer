package responses.students;

public class GetStudentByIdResponse {

    private String firstName;
    private String lastName;
    private String middleName;
    private String status;

    public GetStudentByIdResponse(String firstName, String lastName, String middleName, String status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.status = status;
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
