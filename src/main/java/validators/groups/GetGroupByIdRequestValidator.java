package validators.groups;

import requests.groups.GetGroupByIdRequest;
import validators.Validator;
import validators.simple.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class GetGroupByIdRequestValidator implements Validator<GetGroupByIdRequest> {

    @Override
    public List<String> validate(GetGroupByIdRequest req) {
        List<String> errors = new ArrayList<>();
        IdValidator.validate(req.getId(), errors);
        return errors;
    }
}
