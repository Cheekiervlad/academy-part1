package by.academy.homework.homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String str1 = sc.nextLine();
        System.out.println("Введите вторую строку");
        String str2 = sc.nextLine();
        System.out.println("Слово состоящее из первой половины первого слова и второй половины второго слова: "
                + joinStrings(str1, str2));
        sc.close();
    }

    private static String joinStrings(String str1, String str2) {
        if (str1.length() % 2 == 1 || str2.length() % 2 == 1) {
            return "Введите слова с четным количеством букв";
        }
        return str1.substring(0, str1.length() / 2).concat(str2.substring(str2.length() / 2));
    }
}
