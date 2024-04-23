package validators.lessons;

import validators.Validator;
import requests.lessons.GetLessonsByGroupRequest;
import validators.simple.DateValidator;
import validators.simple.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class GetLessonByGroupRequestValidator implements Validator<GetLessonsByGroupRequest> {

    @Override
    public List<String> validate(GetLessonsByGroupRequest req) {
        List<String> errors = new ArrayList<>();
        DateValidator.isStringContainDate(req.getEndDate(), errors);
        DateValidator.isStringContainDate(req.getStartDate(), errors);
        IdValidator.validate(req.getGroupId(), errors);
        return errors;
    }
}
