package responses.subjects;

public class GetSubjectByIdResponse {
    private String nameOfSubject;

    public GetSubjectByIdResponse(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }
}
