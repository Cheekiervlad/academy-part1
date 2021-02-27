package by.academy.classwork.lesson14.task4;

//4.Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся
// элементов в строке и вывести результат на экран.

import java.util.Arrays;
import java.util.HashSet;

public class Task4 {
    public static void main(String[] args) {
        String str = "1, 2, 3, 4, 4, 5";
        String[] array = str.split(", ");

        HashSet<String> set = new HashSet<>(Arrays.asList(array));

        System.out.println(Arrays.toString(set.toArray()));
    }
}
