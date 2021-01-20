package by.academy.classwork.lesson3.cat;

public class Application {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat("Васька");

        System.out.println("Cat1");
        c1.eat();
        c1.grow();
        c1.sleep();
        c1.walk();

        System.out.println("Cat2");
        c2.eat();
        c2.grow();
        c2.sleep();
        c2.walk();

        c1.grow();
        c1.grow();
        c1.grow();
        System.out.println(c1.getAge());
        System.out.println(c2);
    }
}
