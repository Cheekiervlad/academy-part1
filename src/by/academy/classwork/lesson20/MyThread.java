package by.academy.classwork.lesson20;

public class MyThread extends Thread {

    public void run(){
        for (int i = 10; i > 0; i--){
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
