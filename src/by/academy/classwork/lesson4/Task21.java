package by.academy.classwork.lesson4;

//Дано натуральное n. вычислить 1/(2 в квадрате) + 1/(4 в квадрате)+
//... + 1/(2n в квадрате) ( в квадрате только n)

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число n");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1 / (2.0 * i * i);
        }
        System.out.println(sum);
    }
}
