package validators.students;

import requests.students.GetStudentsByGroupRequest;
import validators.Validator;
import validators.simple.IdValidator;
import validators.simple.StringValidator;
import java.util.ArrayList;
import java.util.List;

public class GetStudentsByGroupRequestValidator implements Validator<GetStudentsByGroupRequest> {

    @Override
    public List<String> validate(GetStudentsByGroupRequest req) {
        List<String > errors = new ArrayList<>();
        IdValidator.validate(req.getIdOfGroup(), errors);
        return errors;
    }
}
