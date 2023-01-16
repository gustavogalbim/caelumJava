package neliosudemy.exercicios;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de numeros: ");
        int numbers = scanner.nextInt();
        double[] vector = new double[numbers];

        for (int i = 0; i < vector.length; i++){
            scanner.nextLine();
            System.out.println("Digite um numero: ");
            vector[i] = scanner.nextDouble();
        }

        for (int i = 0; i < vector.length; i++){
            if (vector[i] > 0) {
                System.out.println("VALORES: " + vector[i]);
            }
        }

        double sum = 0;
        for (int i = 0; i < vector.length; i++){
            sum += vector[i];
        }
        System.out.println("SOMA = " +sum);

        double average = sum / vector.length;
        System.out.println("MEDIA = " +average);

    }

}
