package by.academy.classwork.lesson10;

import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(1970,1,1).plusYears(30).minusMonths(7).minusDays(3);
        System.out.println(ld);
    }
}
