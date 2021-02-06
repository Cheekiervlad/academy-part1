package by.academy.deal;

public class Deal {
    private Person seller;
    private Person buyer;
    private Product[] products;
    private String dealDate;

    public Deal() {
        super();
    }

    private double priceBill() {
        double price = 0;
        for (Product product : products) {
            price += product.getPrice() * product.discount() * product.getQuantity();
            System.out.println(product.getName() + ", цена: " + product.getPrice() + ", количество: "
                    + product.getQuantity() + ", скидка: " + product.discount() + ", общая цена: "
                    + product.getPrice() * product.discount() * product.getQuantity());
        }
        System.out.println("Общая сумма: " + price);
        return price;
    }

    public Person getSeller() {
        return seller;
    }

    public void setSeller(Person seller) {
        this.seller = seller;
    }

    public Person getBuyer() {
        return buyer;
    }

    public void setBuyer(Person buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }
}
