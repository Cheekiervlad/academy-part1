package by.academy.classwork.lesson5;

//Ввести n строк с консоли, найти самую короткую и самую длинную строки.
//Вывести найденные строки и их длину.

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLine();
        }

        String longStr = array[0];
        int lengthLongStr = array[0].length();
        String shortStr = array[0];
        int lengthShortStr = array[0].length();
        for (int i = 1; i < n; i++) {
            if (array[i].length() > lengthLongStr) {
                longStr = array[i];
                lengthLongStr = array[i].length();
            }
            if (array[i].length() < lengthShortStr) {
                shortStr = array[i];
                lengthShortStr = array[i].length();
            }
        }

        System.out.println("Самая длиная строка: " + longStr + ", с длиной символов: " + lengthLongStr);
        System.out.println("Самая короткая строка: " + shortStr + ", с длиной символов: " + lengthShortStr);
        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
