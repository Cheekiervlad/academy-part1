package by.academy.tasks.statics.task2;

public abstract class Fruit {
    private double weight;

    public void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    abstract double getPrice(double weight);
}
