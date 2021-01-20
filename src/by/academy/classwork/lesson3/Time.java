package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        int time = 370_000;
        int sec;
        int min;
        int h;
        int days;
        int weeks;
        int temp;
        int temp1;
        int temp2;
        sec = time % 60;
        temp = (time - sec) / 60;
        min = temp % 60;
        temp1 = (temp - min) / 60;
        h = temp1 % 24;
        temp2 = (temp1 - h) / 24;
        days = temp2 % 7;
        weeks = (temp2 - days) / 7;

        System.out.println("Недель " + weeks + ","+ "Дней " + days + "," +  "Часов " + h + "," +  "Минут " + min + "," + "Секунд "+ sec );

    }
}

