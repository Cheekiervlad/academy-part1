package by.academy.homework.homework4.task3;

public class IteratorDemo {
    public static void main(String[] args) {
        Integer[][] array1 = {{1, 2, 3, 4, 5, 6, 7, 8, 9}, {3, 2, 1}, {7, 7, 7}};
        Integer[][] array2 = {{}, {}, {2}};
        Integer[][] array3 = {{null}, {null, null, null}};
        Integer[][] array4 = {{}, {}, {}};
        Integer[][] array5 = {{1, null}, {null, 7, null}};
        ArrayIterator<Integer> arrIterator = new ArrayIterator<>(array5);

        while (arrIterator.hasNext()) {
            System.out.println(arrIterator.next());
        }
    }
}
