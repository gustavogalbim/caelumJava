package neliosudemy.exercicios;

import neliosudemy.model.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
/*
    Transformando os atributos do exercicio 1 em um objeto
    representação em forma de entidade para utilizar da mesma classe os atributos
 */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        System.out.println("First value: ");
        x.a = scanner.nextDouble();
        System.out.println("Second value: ");
        x.b = scanner.nextDouble();
        System.out.println("Last value: ");
        x.c = scanner.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        System.out.println("First value: ");
        y.a = scanner.nextDouble();
        System.out.println("Second value: ");
        y.b = scanner.nextDouble();
        System.out.println("Last value: ");
        y.c = scanner.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        scanner.close();
    }

}
