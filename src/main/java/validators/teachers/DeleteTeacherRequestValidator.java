package validators.teachers;

import validators.Validator;
import requests.students.AddStudentRequest;
import requests.teachers.DeleteTeacherRequest;
import validators.simple.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class DeleteTeacherRequestValidator implements Validator<DeleteTeacherRequest> {
    private AddStudentRequest request;

    DeleteTeacherRequestValidator(AddStudentRequest request){
        this.request = request;
    }


    @Override
    public List<String> validate(DeleteTeacherRequest request) {
        List<String> errors = new ArrayList<>();
        IdValidator.validate(request.getId(), errors);
        return errors;
    }
}
