package by.academy.classwork.lesson18;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DemoTest {
    public static void main(String[] args) {
        Class<Cat> catClass = Cat.class;
        Class<Tiger> tigerClass = Tiger.class;
        Cat cat = new Cat(20);
        Tiger tiger = new Tiger(10);


        Method[] methodsCats = catClass.getDeclaredMethods();
        for (Method method : methodsCats) {
            System.out.println(method.toString());
        }
        System.out.println("-------------------");

        Method[] methodsTiger = tigerClass.getDeclaredMethods();
        for (Method method : methodsTiger) {
            System.out.println(method.toString());

        }
        System.out.println("-------------------");

        Field[] fieldCats = catClass.getDeclaredFields();
        for (Field field : fieldCats) {
            System.out.println(field.toString());
        }
        System.out.println("-------------------");

        Field[] fieldTiger = tigerClass.getDeclaredFields();
        for (Field field : fieldTiger) {
            System.out.println(field.toString());
        }
        System.out.println("-------------------");

        try {
            Field fieldCatId = catClass.getDeclaredField("id");
            fieldCatId.setAccessible(true);
            System.out.println(fieldCatId.get(cat));
            fieldCatId.set(cat, 25);
            System.out.println(fieldCatId.get(cat));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("-------------------");

        try {
            Method methodRun = tigerClass.getDeclaredMethod("run");
            methodRun.setAccessible(true);
            methodRun.invoke(tiger);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("-------------------");

        Description d = catClass.getAnnotation(Description.class);
        System.out.println(d.age() + " " + d.name());
        System.out.println("-------------------");

        Description d2 = tigerClass.getAnnotation(Description.class);
        System.out.println(d2.age() + " " + d2.name());

    }
}

