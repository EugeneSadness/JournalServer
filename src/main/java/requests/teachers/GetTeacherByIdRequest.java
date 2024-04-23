package requests.teachers;

public class GetTeacherByIdRequest {
    private Long id;

    public GetTeacherByIdRequest(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
