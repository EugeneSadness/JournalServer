package validators.lessons;

import validators.Validator;
import requests.lessons.GetLessonsByTeacherRequest;

import java.util.List;

public class GetLessonByTeacherRequestValidator implements Validator<GetLessonsByTeacherRequest> {

    @Override
    public List<String> validate(GetLessonsByTeacherRequest req) {
        return null;
    }
}