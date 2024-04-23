package validators.lessons;

import requests.lessons.EditLessonRequest;
import validators.Validator;
import validators.simple.IdValidator;
import validators.simple.IntValidator;

import java.util.ArrayList;
import java.util.List;

public class EditLessonRequestValidator implements Validator<EditLessonRequest> {

    @Override
    public List<String> validate(EditLessonRequest req) {
        List<String> errors = new ArrayList<>();
        IdValidator.validate(req.getId(), errors);
        IntValidator.isLessThan(req.getNumberOfLesson(), 10, errors);
        return errors;
    }
}
