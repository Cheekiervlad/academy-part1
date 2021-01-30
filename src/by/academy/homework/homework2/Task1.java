package by.academy.homework.homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String str1 = sc.nextLine();
        System.out.println("Введите вторую строку");
        String str2 = sc.nextLine();
        System.out.println(compareStrings(str1, str2));
        sc.close();
    }

    private static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] lettersArray = new int[1278];
        char[] charArray = str1.toCharArray();
        for (char letter : charArray) {
            lettersArray[letter]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            int letter = str2.charAt(i);
            if (lettersArray[letter] < 1) {
                return false;
            } else {
                lettersArray[letter]--;
            }
        }

        return true;
    }
}
