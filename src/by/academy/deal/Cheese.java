package by.academy.deal;

public class Cheese extends Product {
    private int ageInDays;
    private double weight;

    public Cheese() {
        super();
    }

    @Override
    public double discount (){
        if (ageInDays > 20){
            return 0.8;
        } else {
            return 1;
        }
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



