package by.academy.homework.homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму покупки");
        double amount = sc.nextDouble();
        System.out.println("Введите ваш возраст");
        int age = sc.nextInt();
        System.out.println("Сумма к оплате: " + amountToPlay(amount, age) + " рублей");
        sc.close();
    }

    private static double amountToPlay(double amount, int age) {
        if (amount >= 400) {
            amount *= 0.8;
        } else if (amount >= 300) {
            amount *= 0.85;
        } else if (amount >= 200) {
            if (age > 18) {
                amount *= 0.84;
            } else {
                amount *= 0.91;
            }
        } else if (amount >= 100) {
            amount *= 0.93;
        } else {
            amount *= 0.95;
        }
        return amount;
    }
}
