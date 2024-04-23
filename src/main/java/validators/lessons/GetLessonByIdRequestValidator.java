package validators.lessons;

import validators.Validator;
import requests.lessons.GetLessonByIdRequest;
import validators.simple.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class GetLessonByIdRequestValidator implements Validator<GetLessonByIdRequest> {

    @Override
    public List<String> validate(GetLessonByIdRequest req) {
        List<String> errors = new ArrayList<>();
        IdValidator.validate(req.getId(), errors);
        return errors;
    }
}
