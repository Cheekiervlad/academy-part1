package by.academy.classwork.lesson11;

public class Calculator {

    public static <T extends Number, K extends Number> Double sum(T t, K k) {
        return t.doubleValue() + k.doubleValue();
    }

    public static <T extends Number, K extends Number> Double multiply(T t, K k) {
        return t.doubleValue() * k.doubleValue();
    }

    public static <T extends Number, K extends Number> Double divide(T t, K k) {
        return t.doubleValue() / k.doubleValue();
    }

    public static <T extends Number, K extends Number> Double subtraction(T t, K k) {
        return t.doubleValue() - k.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(Calculator.sum(1,5));
    }
}
