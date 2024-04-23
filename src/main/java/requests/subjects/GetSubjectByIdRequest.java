package requests.subjects;

public class GetSubjectByIdRequest {
    private long id;

    public GetSubjectByIdRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
