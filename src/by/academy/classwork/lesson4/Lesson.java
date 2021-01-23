package by.academy.classwork.lesson4;

import java.util.Arrays;

public class Lesson {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 0, 3, 5};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
