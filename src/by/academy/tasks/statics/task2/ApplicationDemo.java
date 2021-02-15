package by.academy.tasks.statics.task2;

public class ApplicationDemo {
    public static void main(String[] args) {

        Fruit apple = new Apple();
        Fruit apricot = new Apricot();
        System.out.println("Стоимость яблок: " + apple.getPrice(10) + "$");
        System.out.println("Стоимость абрикосов: " + apricot.getPrice(5) + "$");
        System.out.println("Общая стоимость: " + (apricot.getPrice(5) + apple.getPrice(10)) + "$");
    }
}
