package by.academy.classwork.lesson4;

//Найти произведение двузначных нечетных чисел кратных 13.

public class Task12 {
    public static void main(String[] args) {
        long multi = 1;
        for (int i = 10; i < 100; i += 2) {
            if (i % 13 == 0) {
                multi *= i;
            }
        }
        System.out.println(multi);
    }
}
