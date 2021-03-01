package by.academy.tasks.collections;

//5.Напишите методы union(Set<?>... set) и intersect(Set<?> ... set), реализующих операции объединения и
// пересечения множеств. Протестируйте работу этих методов на предварительно заполненных множествах.

import java.util.HashSet;
import java.util.Set;

public class Task5 {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        set1.add(5);
        set1.add(8);
        set1.add(9);

        set2.add(10);
        set2.add(9);
        set2.add(5);

        set3.add(1);
        set3.add(2);
        set3.add(5);

        @SuppressWarnings("unchecked")
        Set<Integer> set4 = (HashSet<Integer>) union(set1, set2, set3);
        @SuppressWarnings("unchecked")
        Set<Integer> set5 = (HashSet<Integer>) intersect(set1, set2, set3);

        System.out.println(set4);
        System.out.println(set5);
    }

    public static Set<?> union( Set<?>... set) {
        Set<Object> unionSet = new HashSet<>();
        for (Set<?> set1 : set) {
            unionSet.addAll(set1);
        }
        return unionSet;
    }

    public static Set<?> intersect(Set<?>... set) {
        Set<?> intersectSet = set[0];
        for (Set<?> set1 : set) {
            intersectSet.retainAll(set1);
        }
        return intersectSet;
    }
}
