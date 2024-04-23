package validators.students;

import requests.students.GetStudentByIdRequest;
import validators.Validator;
import validators.simple.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class GetStudentByIdRequestValidator implements Validator<GetStudentByIdRequest> {

    @Override
    public List<String> validate(GetStudentByIdRequest req) {
        List<String> errors = new ArrayList<>();
        IdValidator.validate(req.getId(), errors);
        return errors;
    }
}
