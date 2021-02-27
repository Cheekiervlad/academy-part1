package by.academy.classwork.lesson14.task1;

import java.util.ArrayList;
import java.util.Arrays;

//1.а) Создать динамический массив, содержащий объекты класса HeavyBox.
// б) Распечатать его содержимое используя for each.
// в) Изменить вес первого ящика на 1.
// г) Удалить последний ящик.
// д) Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
// е) Удалить все ящики.

public class Task1 {
    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(5, 5, 5, 10));
        boxes.add(new HeavyBox(3, 3, 2, 7));
        boxes.add(new HeavyBox(2, 2, 2, 2));
        boxes.add(new HeavyBox(3, 4, 5, 12));

        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        boxes.get(0).setWeight(boxes.get(0).getWeight() - 1);
        boxes.remove(3);

        // 1 вариант
        Object[] objectArray = boxes.toArray();
        System.out.println(Arrays.toString(objectArray));

        // 2 вариант
        HeavyBox[] HeavyArray1 = new HeavyBox[boxes.size()];
        boxes.toArray(HeavyArray1);
        System.out.println(Arrays.toString(HeavyArray1));

        // 3 вариант
        HeavyBox[] HeavyArray2 = boxes.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(HeavyArray2));

        boxes.clear();
    }
}
