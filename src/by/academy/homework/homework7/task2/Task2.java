package by.academy.homework.homework7.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.NoSuchElementException;

public class Task2 {

    public static void main(String[] args) {
        User user = new User("Вася", "Дудкин", 18, LocalDate.of(2002, 10, 10),
                "admin", "qwerty", "admin@mail.ru");

        Class<User> userClass = User.class;
        Class<? super User> userSuperClass = userClass.getSuperclass();

        try {
            Method userGetLogin = userClass.getMethod("getLogin");
            System.out.println(userGetLogin.toString());
        } catch (NoSuchElementException | NoSuchMethodException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("-------------------");

        Method[] methodsUser = userClass.getMethods();
        for (Method method : methodsUser) {
            System.out.println(method.toString());
        }
        System.out.println("-------------------");

        try {
            Field fieldLogin = userClass.getField("login");
            System.out.println(fieldLogin.toString());
        } catch (NoSuchFieldException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-------------------");

        Field[] fieldsUser = userClass.getFields();
        for (Field field : fieldsUser) {
            System.out.println(field.toString());
        }
        System.out.println("-------------------");

        try {
            Method userGetLogin = userClass.getDeclaredMethod("getLogin");
            System.out.println(userGetLogin.toString());
        } catch (NoSuchElementException | NoSuchMethodException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("-------------------");

        Method[] declaredMethodsUser = userClass.getDeclaredMethods();
        for (Method method : declaredMethodsUser) {
            System.out.println(method.toString());
        }
        Method[] declaredMethodsUserSuper = userSuperClass.getDeclaredMethods();
        for (Method method : declaredMethodsUserSuper) {
            System.out.println(method.toString());
        }
        System.out.println("-------------------");

        try {
            Field fieldLogin = userClass.getDeclaredField("login");
            System.out.println(fieldLogin.toString());
        } catch (NoSuchFieldException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-------------------");

        Field[] declaredFieldsUser = userClass.getDeclaredFields();
        for (Field field : declaredFieldsUser) {
            System.out.println(field.toString());
        }
        Field[] declaredFieldsUserSuper = userSuperClass.getDeclaredFields();
        for (Field field : declaredFieldsUserSuper) {
            System.out.println(field.toString());
        }
        System.out.println("-------------------");

        try {
            Field[] declaredFieldsUserValue = userClass.getDeclaredFields();
            for (Field field : declaredFieldsUserValue) {
                field.setAccessible(true);
                System.out.println(field.get(user));
            }
            Field[] declaredFieldsUserSuperValue = userSuperClass.getDeclaredFields();
            for (Field field : declaredFieldsUserSuperValue) {
                field.setAccessible(true);
                System.out.println(field.get(user));
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("-------------------");

        try {
            Field fieldLogin = userClass.getDeclaredField("login");
            fieldLogin.setAccessible(true);
            fieldLogin.set(user, "alalal");

            Field fieldPassword = userClass.getDeclaredField("password");
            fieldPassword.setAccessible(true);
            fieldPassword.set(user, "alalal");

            Field fieldEmail = userClass.getDeclaredField("email");
            fieldEmail.setAccessible(true);
            fieldEmail.set(user, "alalal@mail.ru");

            Field fieldsFirstName = userSuperClass.getDeclaredField("firstName");
            fieldsFirstName.setAccessible(true);
            fieldsFirstName.set(user, "alalal");

            Field fieldsLastName = userSuperClass.getDeclaredField("lastName");
            fieldsLastName.setAccessible(true);
            fieldsLastName.set(user, "alalal");

            Field fieldsLastAge = userSuperClass.getDeclaredField("age");
            fieldsLastAge.setAccessible(true);
            fieldsLastAge.set(user, 3);

            Field fieldsLastDateOfBirth = userSuperClass.getDeclaredField("dateOfBirth");
            fieldsLastDateOfBirth.setAccessible(true);
            fieldsLastDateOfBirth.set(user, LocalDate.of(2018, 1, 1));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("finished set");
        System.out.println("-------------------");

        try {
            Method userPrintUserInfo = userClass.getDeclaredMethod("printUserInfo");
            System.out.println(userPrintUserInfo.invoke(user));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            System.out.println(e.getMessage());
        }
    }
}