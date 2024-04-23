package requests.students;

public class GetStudentByIdRequest {

    private long id;

    public GetStudentByIdRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

}
