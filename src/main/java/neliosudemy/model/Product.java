package neliosudemy.model;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public static String COMMA = ", ";

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