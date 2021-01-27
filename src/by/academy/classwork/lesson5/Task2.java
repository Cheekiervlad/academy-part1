package by.academy.classwork.lesson5;

// Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLine();
        }

        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (array[i].length() > array[j].length()) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }

        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
