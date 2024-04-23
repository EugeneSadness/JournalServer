package requests.lessons;

public class DeleteLessonRequest {
    private long id;

    public DeleteLessonRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
