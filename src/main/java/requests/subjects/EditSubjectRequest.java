package requests.subjects;

public class EditSubjectRequest {
    private long id;
    private String nameOfSubject;

    public EditSubjectRequest(long id, String nameOfSubject) {
        this.id = id;
        this.nameOfSubject = nameOfSubject;
    }

    public long getId() {
        return id;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }
}
