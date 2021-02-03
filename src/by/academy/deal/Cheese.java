package by.academy.deal;

public class Cheese extends Product {
    private int ageInDays;
    private double weight;

    public Cheese() {
        super();
    }

    void grows(int ageInDays) {
        this.ageInDays++;
    }

    void eat(int ageInDays) {
        this.weight--;
    }

    public int getAgeInDays() {
        return ageInDays;
    }

    public void setAgeInDays(int ageInDays) {
        this.ageInDays = ageInDays;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}



