package by.academy.tasks.arrays;

//Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать каждый урок с того,
//чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек, а примеры среди них не должны повторяться.
//В помощь учителю напишите программу, которая будет выводить на экран 15 случайных примеров из таблицы умножения
//(от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты).
//При этом среди 15 примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).

import java.util.Random;

public class Task18 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[15][2];
        int[] arrayOfNumbers = {2, 3, 4, 5, 6, 7, 8, 9};
        array[0][0] = random.nextInt(8);
        array[0][1] = random.nextInt(8);
        System.out.println(array[0][0] + "*" + array[0][1]);
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int num1 = random.nextInt(8);
                array[i][j] = arrayOfNumbers[num1];
            }
            for (int k = 0; k < i; k++) {
                if ((array[i][0] * array[i][1]) == (array[k][0] * array[k][1])) {
                    i--;
                }
            }
        }
        for (int i = 1; i < 15; i++) {
            System.out.println(array[i][0] + "*" + array[i][1]);
        }
    }
}

