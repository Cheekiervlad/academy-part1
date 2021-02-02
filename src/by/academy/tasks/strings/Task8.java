package by.academy.tasks.strings;

//Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром.
//Если таких слов больше одного, найти второе из них.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество слов для проверки:");
        int n = sc.nextInt();
        String[] array = new String[n];

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLine();
        }

        List<String> palindrome = new ArrayList<>();
        String reg = "^[0-9]+$";
        Pattern pattern = Pattern.compile(reg);
        for (int i = 0; i < n; i++) {
            Matcher matcher = pattern.matcher(array[i]);
            if (matcher.find()) {
                StringBuilder temp = new StringBuilder();
                for (int j = array[i].length() - 1; j >= 0; j--) {
                    temp.append(array[i].charAt(j));
                }
                if (array[i].equals(temp.toString())) {
                    palindrome.add(array[i]);
                }
            }
        }

        if (palindrome.size() > 1) {
            System.out.println("слово-палиндром: " + palindrome.get(1));
        } else if (palindrome.size() == 1) {
            System.out.println("слово-палиндром: " + palindrome.get(0));
        } else {
            System.out.println("слово-палиндром не найдено");
        }
        sc.close();
    }
}
