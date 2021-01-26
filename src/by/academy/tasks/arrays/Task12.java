package by.academy.tasks.arrays;

//Программа должна создать массив из 12 случайных целых чисел из отрезка[-10;10] таким образом,чтобы отрицательных и
//положительных элементов там было поровну и не было нулей. При этом порядок следования элементов должен быть
//случаен(т.е.не подходит вариант,когда в массиве постоянно выпадает сначала 6 положительных,а потом 6 отрицательных
//чисел или же когда элементы постоянно чередуются через один и пр.).Вывести полученный массив на экран.

import java.util.Arrays;
import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];
        int countOfMinuses = 0;
        int countOfPluses = 0;

        for (int i = 0; i < array.length; i++) {
            if (countOfPluses == 6) {
                array[i] = -10 + random.nextInt(10);
            } else if (countOfMinuses == 6) {
                array[i] = 1 + random.nextInt(10);
            } else {
                array[i] = -10 + random.nextInt(21);
                while (array[i] == 0) {
                    array[i] = -10 + random.nextInt(21);
                }
            }
            if (array[i] > 0) {
                countOfPluses++;
            } else {
                countOfMinuses++;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
