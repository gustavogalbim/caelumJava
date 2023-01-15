package neliosudemy.exercicios;

import neliosudemy.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter radius: ");
        double radius = scanner.nextDouble();
        double circle = Calculator.circumference(radius);
        double volume = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", circle);
        System.out.printf("VOlume: %.2f%n", volume);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

    }
}
