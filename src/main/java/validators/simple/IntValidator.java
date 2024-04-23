package validators.simple;

import validators.Validator;

import java.util.List;

public class IntValidator {
    public static void isLessThan(int n, int max, List<String> errors){
        if(n > max)
            errors.add("String validator for " + n + " returned error ");
    }
}
