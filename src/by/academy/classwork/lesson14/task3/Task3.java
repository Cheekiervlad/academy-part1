package by.academy.classwork.lesson14.task3;

import by.academy.classwork.lesson14.task1.HeavyBox;

import java.util.Comparator;
import java.util.TreeSet;

//3.Создать TreeSet содержащий HeavyBox. HeavyBox должен реализовать интерфейс Comparable.
// Распечатать содержимое с помощью for each.

public class Task3 {
    public static void main(String[] args) {
        TreeSet<HeavyBox> boxes = new TreeSet<>();

        boxes.add(new HeavyBox(5, 5, 5, 10));
        boxes.add(new HeavyBox(3, 3, 2, 7));
        boxes.add(new HeavyBox(2, 2, 2, 2));
        boxes.add(new HeavyBox(3, 4, 5, 12));

        for (HeavyBox box : boxes)
            System.out.println(box);
    }

}
