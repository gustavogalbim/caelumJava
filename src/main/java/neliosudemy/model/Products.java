package neliosudemy.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Products {

    private String name;
    private double price;

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }


}
