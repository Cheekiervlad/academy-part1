package by.academy.tasks.statics.task1;

public class ApplicationDemo {
    public static void main(String[] args) {
        Rose rose = new Rose("Китай", 10, 3, "Белый");
        Tulip tulip = new Tulip("Галандия", 15, 1, "Красный");

        Bouquet bouquet1 = new Bouquet();
        bouquet1.addFlower(rose, 10);
        bouquet1.addFlower(tulip, 5);
        System.out.println(bouquet1.getPrice());

        Bouquet bouquet2 = new Bouquet();
        bouquet2.addFlower(rose, 101);
        System.out.println(bouquet2.getPrice());

        Bouquet bouquet3 = new Bouquet();
        bouquet3.addFlower(tulip, 31);
        System.out.println(bouquet3.getPrice());

        System.out.println(Bouquet.getAmountOfFlowers());

    }

}
