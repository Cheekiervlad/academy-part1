package by.academy.tasks.oop.task5;

public class Solve {
    public static void main(String[] args) {
        getQueue(10, 25);
    }

    private static void getQueue(int a, int b) {
        if (a == b) {
            return;
        }
        int c;
        if (a < b) {
            c = a + 1;
        } else {
            c = a - 1;
        }
        System.out.println(c);
        getQueue(c, b);
    }
}
