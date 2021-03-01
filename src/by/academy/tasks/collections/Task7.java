package by.academy.tasks.collections;

//7.Создать коллекцию, содержащую объекты HeavyBox. Написать метод, который перебирает элементы коллекции и проверяет
// вес коробок. Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.

import by.academy.classwork.lesson14.task1.HeavyBox;
import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List <HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(5, 5, 5, 100));
        boxes.add(new HeavyBox(3, 3, 2, 700));
        boxes.add(new HeavyBox(2, 2, 2, 200));
        boxes.add(new HeavyBox(3, 4, 5, 1200));

        System.out.println(boxes);
    }

    private static List <HeavyBox> checkWeight(List<HeavyBox> boxes){
        boxes.removeIf(box -> box.getWeight() > 300);
        return boxes;
    }
}
