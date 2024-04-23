package requests.groups;

public class GetGroupByIdRequest {
    private long id;

    public GetGroupByIdRequest(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
