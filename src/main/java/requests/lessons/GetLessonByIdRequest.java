package requests.lessons;

public class GetLessonByIdRequest {
    private long id;

    public GetLessonByIdRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
