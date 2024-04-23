package controllers.groups;

import entities.Group;
import repositories.Storage;
import requests.groups.AddGroupRequest;
import requests.groups.DeleteGroupRequest;
import requests.groups.EditGroupRequest;
import requests.groups.GetGroupByIdRequest;
import responses.ResponseEntity;
import responses.groups.AddGroupResponse;
import responses.groups.DeleteGroupResponse;
import responses.groups.EditGroupResponse;
import responses.groups.GetGroupByIdResponse;
import services.groups.GroupService;
import validators.groups.AddGroupRequestValidator;
import validators.groups.DeleteGroupRequestValidator;
import validators.groups.EditGroupRequestValidator;
import validators.groups.GetGroupByIdRequestValidator;

import java.util.List;

public class GroupController {
    private GroupService groupService;

    public GroupController(Storage storage){
        groupService = new GroupService(storage);
    }

    public ResponseEntity<AddGroupResponse> addGroup(AddGroupRequest req){
        int status;
        long id;
        List<String> errors;
        try {
            errors = new AddGroupRequestValidator().validate(req);
            if(errors.isEmpty()){
                id = groupService.create(req.getName());
                status = 200;
                return new ResponseEntity<AddGroupResponse>(status, new AddGroupResponse(id));
            }
            id = -1;
            status = 400;
            return new ResponseEntity<AddGroupResponse>(status, errors);
        }
        catch (Exception e){
            return new ResponseEntity<AddGroupResponse>(400, List.of("Some error happens!"));
        }
    }

    public ResponseEntity<GetGroupByIdResponse> getGroupById(GetGroupByIdRequest req){
        int status;
        long id;
        List<String> errors;
        try {
            errors = new GetGroupByIdRequestValidator().validate(req);
            if(errors.isEmpty()){
                Group group = groupService.read(req.getId());
                status = 200;
                return new ResponseEntity<GetGroupByIdResponse>(status, new GetGroupByIdResponse(group.getNameOfGroup()));
            }
            System.out.println("return error status code");
            id = -1;
            status = 400;
            return new ResponseEntity<GetGroupByIdResponse>(status, errors);
        }
        catch (Exception e){
            return new ResponseEntity<GetGroupByIdResponse>(400, List.of("Some error happens!"));
        }
    }

    public ResponseEntity<EditGroupResponse> editGroup(EditGroupRequest req){
        int status;
        List<String> errors;
        try {
            errors = new EditGroupRequestValidator().validate(req);
            if(errors.isEmpty()){
                groupService.update(req.getId(), req.getName());
                status = 200;
                return new ResponseEntity<EditGroupResponse>(status, new EditGroupResponse());
            }
            System.out.println("return error status code");
            status = 400;
            return new ResponseEntity<EditGroupResponse>(status, errors);
        }
        catch (Exception e){
            return new ResponseEntity<EditGroupResponse>(400, List.of("Some error happens!"));
        }
    }

    public ResponseEntity<DeleteGroupResponse> deleteGroup(DeleteGroupRequest req){
        int status;
        List<String> errors;
        try {
            errors = new DeleteGroupRequestValidator().validate(req);
            if(errors.isEmpty()){
                groupService.delete(req.getId());
                status = 200;
                return new ResponseEntity<DeleteGroupResponse>(status, new DeleteGroupResponse());
            }
            status = 400;
            return new ResponseEntity<DeleteGroupResponse>(status, errors);
        }
        catch (Exception e){
            return new ResponseEntity<DeleteGroupResponse>(400, List.of("Some error happens!"));
        }
    }
}
