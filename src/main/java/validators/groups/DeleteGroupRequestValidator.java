package validators.groups;

import requests.groups.DeleteGroupRequest;
import requests.lessons.DeleteLessonRequest;
import validators.Validator;
import validators.simple.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class DeleteGroupRequestValidator implements Validator<DeleteGroupRequest> {

    @Override
    public List<String> validate(DeleteGroupRequest req) {
        List<String> errors = new ArrayList<>();
        IdValidator.validate(req.getId(), errors);
        return errors;
    }
}
