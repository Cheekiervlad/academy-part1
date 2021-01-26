package by.academy.classwork.lesson4;

import java.util.Arrays;

public class Lesson {
    public static void main(String[] args) {
        int[] array = {2, 5, 7, 9, 3, 1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
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
