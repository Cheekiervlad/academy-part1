package by.academy.tasks.oop.task12;

public class User {
    private Basket basket;
    private String login;
    private String password;

    public User(Basket basket, String login, String password) {
        this.basket = basket;
        this.login = login;
        this.password = password;
    }

    public double getPrice(Basket basket) {
        double price = 0;
        for (Product product : basket.getProducts()) {
            price += product.getPrice();
        }
        return price;
    }
}
