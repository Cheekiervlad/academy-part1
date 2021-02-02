package by.academy.tasks.strings;

//13. Написать программу, позволяющую корректно находить корни квадратного уравнения.
//Параметры уравнения должны задаваться с командной строки.

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите параметри квадратного уравнения в форме: ax2 + bx + c");
        System.out.println("Введите параметр а");
        double a = scanner.nextDouble();
        System.out.println("Введите параметр b");
        double b = scanner.nextDouble();
        System.out.println("Введите параметр c");
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Корней нет");
            return;
        }
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("Корни уравнения: х1 = " + x1 + ", x2 = " + x2);
    }
}
