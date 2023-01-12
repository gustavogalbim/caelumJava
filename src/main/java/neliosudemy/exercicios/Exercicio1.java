package neliosudemy.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

    /*
    Fazer um programa para ler as medidas dos lados de dois triangulos X e Y
    Suponha medidas validas..
    Em seguida, mostrar o valor das areas dos dois triangulos e dizer qual possui a maior area

    Exemplo de medidas:
    triangulo (X) = 3.00, 4.00, 5.00
    triangulo (Y) = 7.50, 4.50, 4.02
     */

    public static void main(String[] args) {

        double xA;
        double xB;
        double xC;
        double yA;
        double yB;
        double yC;

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X: ");
        System.out.println("First value: ");
        xA = scanner.nextDouble();
        System.out.println("Second value: ");
        xB = scanner.nextDouble();
        System.out.println("Last value: ");
        xC = scanner.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        System.out.println("First value: ");
        yA = scanner.nextDouble();
        System.out.println("Second value: ");
        yB = scanner.nextDouble();
        System.out.println("Last value: ");
        yC = scanner.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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
