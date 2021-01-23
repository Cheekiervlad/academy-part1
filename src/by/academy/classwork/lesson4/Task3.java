package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long multi = 1;
        for(int i = 1; i <= n; i++){
            multi *=i;
        }
        System.out.println("Произведение чисел: " + multi);
    }
}
