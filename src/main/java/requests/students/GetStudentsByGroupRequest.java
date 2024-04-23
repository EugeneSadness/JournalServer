package requests.students;

public class GetStudentsByGroupRequest {

    private long id;

    public GetStudentsByGroupRequest(long id) {
        this.id = id;
    }

    public long getIdOfGroup() {
        return id;
    }
}
