package by.academy.tasks.strings;

//6. Ввести n слов с консоли. Найти слово, символы в котором идут в строгом порядке
//возрастания их кодов. Если таких слов несколько, найти первое из них.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество слов для проверки:");
        int n = sc.nextInt();
        String[] array = new String[n];

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            int countLetters = 0;
            for (int j = 0; j < array[i].length() - 1; j++) {
                if (array[i].charAt(j) < array[i].charAt(j + 1)) {
                    countLetters++;
                }
            }
            if (countLetters == array[i].length() - 1){
                System.out.println(array[i]);
                break;
            }
        }
        sc.close();
    }
}
