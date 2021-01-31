package by.academy.tasks.regExp;

//4.Напишите два цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String,
//а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения.

import java.util.Date;

public class Task4 {
    public static void main(String[] args) {
        String text = "I love java";
        String newText = "";

        Date currentTimeString = new Date();
        for (int i = 0; i < 10000 ; i++){
           newText += text;
        }
        Date newTimeString = new Date();
        long time1 = newTimeString.getTime() - currentTimeString.getTime();
        System.out.println(time1);

        Date currentTimeBuilder = new Date();
        StringBuilder stringBuilder = new StringBuilder(text);
        for (int i = 0; i < 10000 ; i++){
            stringBuilder.append(text);
        }
        Date newTimeBuilder = new Date();
        long time2 = newTimeBuilder.getTime() - currentTimeBuilder.getTime();
        System.out.println(time2);
    }
}

