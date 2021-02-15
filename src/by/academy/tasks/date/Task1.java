package by.academy.tasks.date;

import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1996, 5, 27);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());

        LocalDate date2 = LocalDate.now();
        System.out.println(date.isAfter(date2));
        System.out.println(date.isBefore(date2));
    }
}