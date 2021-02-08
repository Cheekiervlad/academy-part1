package by.academy.tasks.oop.task8;

public class Horse extends Animal {

    String name;

    @Override
    public void makeNoise() {
        System.out.println("лошадь шумит");
    }

    @Override
    public void eat() {
        System.out.println("лошадь ест");
    }
}
