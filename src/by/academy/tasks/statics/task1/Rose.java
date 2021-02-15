package by.academy.tasks.statics.task1;

public class Rose extends Flower {
    private String color;


    public Rose() {
        super();
    }

    public Rose(String country, int shelfLife, double price, String color) {
        super(country, shelfLife, price);
        this.color = color;
    }

}
