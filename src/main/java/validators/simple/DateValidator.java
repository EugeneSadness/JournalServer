package validators.simple;

import java.time.LocalDate;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator {
    public static void isStringContainDate(String date, List<String> errors){
        LocalDate datePars = LocalDate.parse(date);
        if(datePars.equals(""))
            errors.add("Date validator for date = "+ date + " returned false /n");
    }
}
