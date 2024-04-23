package requests.teachers;

public class DeleteTeacherRequest {
    private Long id;

    public DeleteTeacherRequest(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
