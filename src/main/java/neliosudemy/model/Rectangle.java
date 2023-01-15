package neliosudemy.model;

public class Rectangle {

    public double width;
    public double height;

    public double area(double width, double height){
        return width * height;
    }
    public double perimeter(double width) {
        return 4 * width;
    }
    public double diagonal(double width, double height){
        double result = (width * width) * (height * height);
        return Math.sqrt(result);
    }

}
