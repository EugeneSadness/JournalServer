package requests.subjects;

public class AddSubjectRequest {
    private String nameOfSubject;

    public AddSubjectRequest(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }
}
