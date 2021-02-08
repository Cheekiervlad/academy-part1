package by.academy.tasks.oop.task8;

public class Vet {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(), new Horse()};
        Vet vet = new Vet();
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }

    public void treatAnimal(Animal animal) {
        System.out.println(animal.food);
        System.out.println(animal.location);
    }
}
