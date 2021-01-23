package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумма денег для вклада");
        double money = sc.nextDouble();
        System.out.println("Введите срок хранения в годах");
        int years = sc.nextInt();
        for (int i = 0; i < years; i++) {
            money *= 1.03;
        }
        System.out.println("Ваша сумма через " + years + " лет составит: " + money);
    }
}
