package validators.simple;

import java.util.List;

public class StringValidator {

    public static void validate(String data, List<String> errors, int maxLength) {
        if(data.equals("") && data.length() > maxLength)
            errors.add("String validator for " + data + " returned error");
    }
}
