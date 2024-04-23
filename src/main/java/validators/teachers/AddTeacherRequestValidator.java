package validators.teachers;

import validators.Validator;
import requests.students.AddStudentRequest;
import requests.teachers.AddTeacherRequest;
import validators.simple.StringValidator;
import java.util.ArrayList;
import java.util.List;

public class AddTeacherRequestValidator implements Validator<AddTeacherRequest> {
    private AddStudentRequest request;

    AddTeacherRequestValidator(AddStudentRequest request){
        this.request = request;
    }


    @Override
    public List<String> validate(AddTeacherRequest request) {
        List<String> errors = new ArrayList<>();
        StringValidator.validate(request.getFirstName(), errors, 15);
        StringValidator.validate(request.getMiddleName(), errors, 15);
        StringValidator.validate(request.getLastName(), errors, 15);
        return errors;
    }
}
