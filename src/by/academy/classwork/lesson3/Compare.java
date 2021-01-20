package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a < b) {
            System.out.println("Меньше значение число: " + a);
            System.out.println("Большее значение число: " + b);
        }
        else {
            System.out.println("Меньше значение число: " + b);
            System.out.println("Большее значение число: " + a);
        }
        System.out.println("Среднее арифмитическое: " + (a + b)/2.0);
    }
}
