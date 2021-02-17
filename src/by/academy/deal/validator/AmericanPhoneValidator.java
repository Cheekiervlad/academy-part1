package by.academy.deal.validator;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator{
    private static final Pattern pattern = Pattern.compile("\\+1\\d{10}");

    @Override
    public boolean validate (String strPhoneNumber){
        return pattern.matcher(strPhoneNumber.trim()).matches();
    }
}