package validators.students;

import validators.Validator;
import requests.students.AddStudentRequest;
import requests.students.DeleteStudentRequest;
import validators.simple.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class DeleteStudentRequestValidator implements Validator<DeleteStudentRequest> {

    @Override
    public List<String> validate(DeleteStudentRequest req) {
        List<String> errors = new ArrayList<>();
        IdValidator.validate(req.getId(), errors);
        return errors;
    }
}

