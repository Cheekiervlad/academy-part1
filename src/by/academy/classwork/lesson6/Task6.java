package by.academy.classwork.lesson6;

//6. Написать regexp для email.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String mail = " Acad@mail.ru";
        mail = mail.trim();
        String regexp = "\\w+@\\w+\\.\\w+";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(mail);
        System.out.println(matcher.matches());
    }
}
