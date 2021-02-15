package by.academy.tasks.statics.task1;

public class Tulip extends Flower {
    private String color;

    public Tulip() {
        super();
    }

    public Tulip(String country, int shelfLife, double price, String color) {
        super(country, shelfLife, price);
        this.color = color;
    }
}
