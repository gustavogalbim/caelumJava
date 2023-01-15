package neliosudemy.exercicios;

import neliosudemy.model.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        System.out.println("Width: ");
        rectangle.width = scanner.nextDouble();
        System.out.println("Height: ");
        rectangle.height = scanner.nextDouble();

        double area = rectangle.area(rectangle.width, rectangle.height);
        System.out.println("AREA = " +area);
        double perimeter = rectangle.perimeter(rectangle.width);
        System.out.println("PERIMETER = " +perimeter);
        double diagonal = rectangle.diagonal(rectangle.width, rectangle.height);
        System.out.println("DIAGONAL = " +diagonal);
    }
}
