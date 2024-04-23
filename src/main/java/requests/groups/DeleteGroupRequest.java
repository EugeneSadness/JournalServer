package requests.groups;

public class DeleteGroupRequest {
    private long id;

    public DeleteGroupRequest(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
