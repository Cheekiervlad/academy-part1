package by.academy.deal;

public class Wine extends Product {
    private int age;
    private String country;

    @Override
    public double discount (){
        if (country.equals("Italy")){
            return 0.83;
        } else {
            return 1;
        }
    }

    public Wine() {
        super();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
