package by.academy.classwork.lesson4;

//Написать программу,
//которая по заданным значениям чисел a и b находит a в степени b.
//В запросе укажите допустимые значения этих переменных
//( Например если а - дробное, то b не может быть отрицательным).

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a (а > 0)");
        double a = sc.nextDouble();
        System.out.println("Введите целое число b (b > 0)");
        int b = sc.nextInt();
        double total = a;
        if (a > 0) {
            if (b > 0) {
                for (int i = 1; i < b; i++) {
                    total *= a;
                }
                System.out.println("а в степени b равно: " + total);
            }
        }
        System.out.println("проверьте значения a и b");
    }
}
