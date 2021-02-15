package by.academy.tasks.statics.task1;

public class Bouquet {
    private Flower[] flowers = new Flower[5];
    private double price = 0;
    private static int amountOfFlowers = 0;
    private int number = 0;

    public void addFlower(Flower flower, int amount) {
        price += flower.getPrice() * amount;
        flowers[number++] = flower;
        amountOfFlowers += amount;
    }

    public double getPrice() {
        return price;
    }

    public static int getAmountOfFlowers() {
        return amountOfFlowers;
    }

}
