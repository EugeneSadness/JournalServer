package validators.lessons;

import requests.lessons.AddLessonRequest;
import validators.Validator;
import validators.simple.IntValidator;

import java.util.ArrayList;
import java.util.List;

public class AddLessonRequestValidator implements Validator<AddLessonRequest> {

    @Override
    public List<String> validate(AddLessonRequest req) {
        List<String> errors = new ArrayList<>();
        IntValidator.isLessThan(req.getNumberOfLesson(), 10, errors);
        return errors;
    }
}
