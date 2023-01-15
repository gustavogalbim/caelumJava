package neliosudemy.model;

public class Student {

    public String name;
    public double firstQuarter;
    public double secondQuarter;
    public double lastQuarter;
    public double finalGrade() {
     return firstQuarter + secondQuarter + lastQuarter;
    }
}
