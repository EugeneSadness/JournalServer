package requests.groups;

public class AddGroupRequest {
    private String name;

    public AddGroupRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
