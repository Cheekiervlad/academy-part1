package by.academy.tasks.collections;

import by.academy.classwork.lesson14.task1.HeavyBox;
import java.util.ArrayDeque;
import java.util.Queue;

//6.Создать очередь, содержащую объекты класса HeavyBox. Используем класс ArrayDeque. Поместить объекты в очередь
// с помощью метода offer(). Удалить объекты методом poll().

public class Task6 {
    public static void main(String[] args) {
        Queue<HeavyBox> heavyBoxes = new ArrayDeque<>();
        heavyBoxes.offer(new HeavyBox(5, 5, 5, 10));
        heavyBoxes.offer(new HeavyBox(3, 3, 2, 7));
        heavyBoxes.offer(new HeavyBox(2, 2, 2, 2));
        heavyBoxes.offer(new HeavyBox(3, 4, 5, 12));
        heavyBoxes.poll();
        heavyBoxes.poll();
        System.out.println(heavyBoxes);
    }
}
