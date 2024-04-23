package validators.lessons;

import requests.lessons.DeleteLessonRequest;
import validators.Validator;
import validators.simple.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class DeleteLessonRequestValidator implements Validator<DeleteLessonRequest> {

    @Override
    public List<String> validate(DeleteLessonRequest req) {
        List<String> errors = new ArrayList<>();
        IdValidator.validate(req.getId(), errors);
        return errors;
    }
}
