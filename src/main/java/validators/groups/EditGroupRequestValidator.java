package validators.groups;

import requests.groups.EditGroupRequest;
import validators.Validator;
import validators.simple.IdValidator;
import validators.simple.StringValidator;

import java.util.ArrayList;
import java.util.List;

public class EditGroupRequestValidator implements Validator<EditGroupRequest> {

    @Override
    public List<String> validate(EditGroupRequest req) {
        List<String> errors = new ArrayList<>();
        StringValidator.validate(req.getName(), errors, 25);
        IdValidator.validate(req.getId(), errors);
        return errors;
    }
}
