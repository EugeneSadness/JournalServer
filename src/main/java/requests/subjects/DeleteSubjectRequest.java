package requests.subjects;

public class DeleteSubjectRequest {
    private long id;

    public DeleteSubjectRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
