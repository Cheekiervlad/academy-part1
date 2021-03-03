package by.academy.classwork.lesson15;

//1.Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
// Login должен содержать только латинские буквы, цифры и знак подчеркивания. Длина login должна быть меньше
// 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
// Password должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password должна быть
// меньше 20 символов. Также password и confirmPassword должны быть равны. Если password не соответствует
// этим требованиям, необходимо выбросить WrongPasswordException.  WrongPasswordException и WrongLoginException
// - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение
// исключения и передает его в конструктор класса Exception. Обработка исключений проводится внутри метода.
// Используем multi-catch block. Метод возвращает true, если значения верны или false в другом случае. (Задание с урока)

import java.util.regex.Pattern;

public class Task1 {

    private static final Pattern pattern = Pattern.compile("[\\w\\d]{1,20}");

    public static void main(String[] args) {
        System.out.println(logIn("123", "faf", "fad"));
    }

    static boolean logIn(String login, String password, String confirmPassword) {
        try {
            if (!pattern.matcher(login).matches()) {
                throw new WrongLoginException("Wrong login");
            }
            if (!pattern.matcher(password).matches() || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Wrong password");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
