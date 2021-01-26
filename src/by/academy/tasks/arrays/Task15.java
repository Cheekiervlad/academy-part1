package by.academy.tasks.arrays;

//Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
//Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента
//этого массива (его индекс не имеет значения).

import java.util.Arrays;
import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        int maxValue = Integer.MIN_VALUE;
        Random random = new Random();
        int[][] array = new int[5][8];
        for (int i = 0; i< array.length; i ++){
            for (int j = 0; j< 8; j ++){
                array[i][j] = -99 + random.nextInt(199);
                if (array[i][j] > maxValue){
                    maxValue = array[i][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(array));
        System.out.println("Максимальное значение внутри двумерного массива: " + maxValue);
    }


}
