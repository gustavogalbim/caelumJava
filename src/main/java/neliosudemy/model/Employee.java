package neliosudemy.model;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(Integer percentage, double resultSalary) {
        resultSalary = this.grossSalary * percentage / 100;
        this.grossSalary = this.grossSalary + resultSalary;
    }
}
