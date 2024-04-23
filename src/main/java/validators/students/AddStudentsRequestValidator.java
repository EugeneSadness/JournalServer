package validators.students;

import validators.Validator;
import requests.students.AddStudentRequest;
import validators.simple.IdValidator;
import validators.simple.StringValidator;

import java.util.ArrayList;
import java.util.List;

public class AddStudentsRequestValidator implements Validator<AddStudentRequest> {

    @Override
    public List<String> validate(AddStudentRequest request) {
        List<String> errors = new ArrayList<>();
        StringValidator.validate(request.getFirstName(), errors, 50);
        StringValidator.validate(request.getMiddleName(), errors, 50);
        StringValidator.validate(request.getLastName(), errors, 50);
        StringValidator.validate(request.getStatus(), errors, 50);
        IdValidator.validate(request.getGroupId(), errors);
        return errors;
    }
}
