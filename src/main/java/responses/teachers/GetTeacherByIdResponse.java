package responses.teachers;

public class GetTeacherByIdResponse {

    private String Firstname;
    private String SecondName;
    private String LastName;

    public GetTeacherByIdResponse(String firstname, String secondName, String lastName) {
        Firstname = firstname;
        SecondName = secondName;
        LastName = lastName;
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
