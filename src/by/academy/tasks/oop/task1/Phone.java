package by.academy.tasks.oop.task1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        phone1.receiveCall("Вася");
        phone1.receiveCall("Вася", "+375296666666");
        phone1.getNumber();
        phone1.sendMessage("+375296666666", "+375296666663");
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        super();
    }

    public void receiveCall(String name) {
        System.out.println("Вам звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Вам звонит " + name + ", номер - " + number);
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
