package by.academy.deal.validator;

import java.util.regex.Pattern;

public class DateValidator implements Validator {
    private static final Pattern pattern = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])[/-]" +
            "(0?[1-9]|1[0-2])[/-](19[0-9]{2}|20[01][0-9]|202[01])");

    @Override
    public boolean validate(String strDate) {
        return pattern.matcher(strDate.trim()).matches();
    }
}