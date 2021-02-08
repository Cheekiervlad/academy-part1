package by.academy.tasks.oop.task8;

public class Dog extends Animal {

    String name;

    @Override
    public void makeNoise() {
        System.out.println("собака шумит");
    }

    @Override
    public void eat() {
        System.out.println("собака ест");
    }
}
