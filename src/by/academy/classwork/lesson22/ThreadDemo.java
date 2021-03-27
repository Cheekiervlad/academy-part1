package by.academy.classwork.lesson22;

public class ThreadDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("a");

        Thread thread1 = new MyThread(sb);
        Thread thread2 = new MyThread(sb);
        Thread thread3 = new MyThread(sb);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
