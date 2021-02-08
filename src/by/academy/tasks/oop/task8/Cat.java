package by.academy.tasks.oop.task8;

public class Cat extends Animal{

    String name;

    @Override
    public void makeNoise() {
        System.out.println("кот шумит");
    }

    @Override
    public void eat() {
        System.out.println("кот ест");
    }
}
