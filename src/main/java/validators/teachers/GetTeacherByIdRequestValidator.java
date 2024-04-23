package validators.teachers;

import validators.Validator;
import requests.teachers.GetTeacherByIdRequest;
import validators.simple.IdValidator;
import java.util.ArrayList;
import java.util.List;

public class GetTeacherByIdRequestValidator implements Validator<GetTeacherByIdRequest> {
    private GetTeacherByIdRequest request;

    GetTeacherByIdRequestValidator(GetTeacherByIdRequest request){
        this.request = request;
    }


    @Override
    public List<String> validate(GetTeacherByIdRequest request) {
        List<String> errors = new ArrayList<>();
        IdValidator.validate(request.getId(), errors);
        return errors;
    }
}
