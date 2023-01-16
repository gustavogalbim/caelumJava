package neliosudemy.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Customer {

    private String name;
    private int age;
    private double height;

    public Customer(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
