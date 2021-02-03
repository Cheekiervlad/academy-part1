package by.academy.deal;

public class Milk extends Product {
    private int ageInDays;
    private double volume;

    public Milk() {
        super();
    }

    void grows(int ageInDays) {
        this.ageInDays++;
    }

    void eat(int ageInDays) {
        this.volume--;
    }

    public int getAgeInDays() {
        return ageInDays;
    }

    public void setAgeInDays(int ageInDays) {
        this.ageInDays = ageInDays;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
