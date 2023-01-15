package neliosudemy.model;

import lombok.Getter;
import lombok.Setter;

public class Product {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private double price;
    @Getter
    private int quantity;

    public Product() {
    }
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static final String COMMA = ", ";

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity  ) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + COMMA
                + "$ "
                + String.format("%.2f", price)
                + COMMA
                + quantity
                + " units, "
                + "Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
