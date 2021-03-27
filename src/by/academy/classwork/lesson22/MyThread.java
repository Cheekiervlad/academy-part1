package by.academy.classwork.lesson22;

public class MyThread extends Thread{

    private StringBuilder sb;

    public MyThread(StringBuilder sb){
        this.sb = sb;
    }

    @Override
    public void run() {
        synchronized (sb){
            for (int i = 0; i < 100; i++){
                System.out.println(sb);
            }
            char ch = sb.charAt(0);
            ch++;
            sb.setCharAt(0,ch);
        }

    }

}
