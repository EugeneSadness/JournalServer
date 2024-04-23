package validators.simple;

import java.util.List;

public class IdValidator {
    public static void validate(Long id, List<String> errors){
        if(id < 0)
            errors.add("Id validator for " + id + "returned error");
    }
}
