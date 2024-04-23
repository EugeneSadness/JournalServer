package responses.groups;

import entities.Group;

public class GetGroupByIdResponse {

    private String  nameOfGroup;

    public GetGroupByIdResponse(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }
}
