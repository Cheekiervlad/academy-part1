package by.academy.classwork.lesson20;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        Thread thread2 = new Thread(new RunnableCalc());
        thread1.start();
        thread2.start();
    }
}
