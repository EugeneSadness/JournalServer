package responses.groups;

import entities.Group;

import java.util.List;

public class GetGroupResponse {

    private List<Group> groups;

    public GetGroupResponse(List<Group> groups) {
        this.groups = groups;
    }

    public List<Group> getGroups() {
        return groups;
    }
}
