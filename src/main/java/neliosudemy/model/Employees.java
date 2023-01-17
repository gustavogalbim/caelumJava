package neliosudemy.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Employees {

    private Integer id;
    private String name;
    private Double salary;

    public Employees(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + ", "
                + name + ", "
                + salary;
    }
}
