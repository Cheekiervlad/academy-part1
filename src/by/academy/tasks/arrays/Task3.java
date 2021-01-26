package by.academy.tasks.arrays;

//Создайте массив из 15 случайных целых чисел из отрезка[0;9].
//Выведите массив на экран.Подсчитайте сколько в массиве чётных элементов
//и выведете это количество на экран на отдельной строке.

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int countOfEven = 0;
        Random random = new Random();
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            if (array[i] % 2 == 0) {
                countOfEven++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(countOfEven);
    }
}