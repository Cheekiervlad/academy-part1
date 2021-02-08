package by.academy.tasks.oop.task12;

public class Product {
    private String name;
    private double price;
    private double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }
}
