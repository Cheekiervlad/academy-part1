package by.academy.classwork.lesson4;

//Задано натуральное число N. Найти количество натуральных чисел,
//не превосходящих N и не делящихся ни на одно из чисел 2,3,5.

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число N");
        int n = sc.nextInt();
        int number = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                number++;
            }
        }
        System.out.println(number);
    }


}
