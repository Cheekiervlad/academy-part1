package by.academy.classwork.lesson1;

public class Application {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Tom");
        cat2.eat();
        cat2.sleep();
        cat2.walk();
        cat1.grow();
        cat1.grow();
        cat1.grow();
        System.out.println(cat1.age);
//        cat2.setIsHomeAnimal(true);
//        System.out.println(cat2.isHomeAnimal());
//        System.out.println(cat2.getInitial());
//        cat1.setInitial('B');
//        System.out.println(cat1.getInitial());
    }
}
