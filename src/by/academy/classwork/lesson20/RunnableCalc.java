package by.academy.classwork.lesson20;

public class RunnableCalc implements Runnable{

    public void run(){
        for (int i = 1; i < 11; i++){
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
