package by.academy.deal.validator;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
    private static final Pattern pattern = Pattern.compile("\\+375(25|29|33|44)\\d{7}");

    @Override
    public boolean validate(String strPhoneNumber) {
        return pattern.matcher(strPhoneNumber.trim()).matches();
    }
}