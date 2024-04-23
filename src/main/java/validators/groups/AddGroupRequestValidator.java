package validators.groups;

import requests.groups.AddGroupRequest;
import validators.Validator;
import validators.simple.StringValidator;

import java.util.ArrayList;
import java.util.List;

public class AddGroupRequestValidator implements Validator<AddGroupRequest> {

    @Override
    public List<String> validate(AddGroupRequest req) {
        List<String> errors = new ArrayList<>();
        StringValidator.validate(req.getName(), errors, 25);
        return errors;
    }
}
