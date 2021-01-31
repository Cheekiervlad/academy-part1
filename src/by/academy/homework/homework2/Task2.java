package by.academy.homework.homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число слов n");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Число слов должно быть от 1 и выше");
            return;
        }

        String[] array = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLine();
        }

        String shortStr = array[0];
        int lengthShortStr = array[0].length();
        for (int i = 0; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < array[i].length(); j++) {
                if (temp.toString().indexOf(array[i].charAt(j)) == -1) {
                    temp.append(array[i].charAt(j));
                }
            }
            if (temp.length() < lengthShortStr) {
                lengthShortStr = temp.length();
                shortStr = array[i];
            }
        }
        System.out.println("Слово, в котором число различных символов минимально: " + shortStr);
        sc.close();
    }
}
