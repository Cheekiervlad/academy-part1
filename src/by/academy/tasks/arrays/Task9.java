package by.academy.tasks.arrays;

//Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
//Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым
//индексом к элементу из второго массива с i-ым индексом. Вывести все три массива на экран
//(каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.

import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int countOfInteger = 0;
        Random random = new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];

        for (int i = 0; i < 10; i++) {
            array1[i] = 1 + random.nextInt(9);
            array2[i] = 1 + random.nextInt(9);
            array3[i] = (double) array1[i] / array2[i];
            if (array3[i] % 1 == 0) {
                countOfInteger++;
            }
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println("Количество целых чисел в 3-ем массиве: " + countOfInteger);
    }
}
