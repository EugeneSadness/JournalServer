package validators.teachers;

import validators.Validator;
import requests.students.EditStudentRequest;
import validators.simple.IdValidator;
import validators.simple.StringValidator;
import java.util.ArrayList;
import java.util.List;

public class EditTeacherRequestValidator implements Validator<EditStudentRequest> {

    private EditStudentRequest request;

    EditTeacherRequestValidator(EditStudentRequest request){}

    @Override
    public List<String> validate(EditStudentRequest req) {
        List<String> errors = new ArrayList<>();
        StringValidator.validate(request.getFirstName(), errors, 25);
        StringValidator.validate(request.getMiddleName(), errors, 25);
        StringValidator.validate(request.getLastName(), errors, 25);
        IdValidator.validate(request.getId(), errors);
        return errors;
    }
}
