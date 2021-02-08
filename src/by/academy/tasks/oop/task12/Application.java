package by.academy.tasks.oop.task12;

public class Application {
    public static void main(String[] args) {
        Product mobilePhone = new Product("Телефон", 500, 4.2);
        Product laptop = new Product("Ноутбук", 1200, 3.8);
        Product[] products = {mobilePhone, laptop};
        Category technics = new Category("Техника", products);
        Basket basket = new Basket(products);
        User user = new User(basket, "lol444", "qwerty");
        System.out.println(user.getPrice(basket));
    }
}
