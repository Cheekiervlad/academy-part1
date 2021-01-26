package by.academy.tasks.arrays;

//Создайте массив из 4 случайных целых чисел из отрезка [10;99],
//выведите его на экран в строку. Определить и вывести на экран сообщение о том,
//является ли массив строго возрастающей последовательностью.

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int countOfEven = 0;
        Random random = new Random();
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + random.nextInt(90);
        }

        for (int i = 0; i < 3; i++) {
            if (array[i] < array[i + 1]) {
                countOfEven++;
            }
        }

        System.out.println(Arrays.toString(array));
        if (countOfEven == 3) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}

