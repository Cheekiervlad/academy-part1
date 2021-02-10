package by.academy.deal;

public class Meat extends Product {
    private int age;
    private double weight;

    public Meat() {
        super();
    }

    @Override
    public double discount (){
        if (getQuantity() > 20){
            return 0.9;
        } else {
            return 1;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int ageInDays) {
        this.age = ageInDays;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
