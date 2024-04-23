package requests.groups;

public class EditGroupRequest {
    private long id;
    private String name;

    public EditGroupRequest(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
