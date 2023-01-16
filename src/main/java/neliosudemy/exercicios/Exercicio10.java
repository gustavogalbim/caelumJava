package neliosudemy.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
/*
Exemplo de vetores
 */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor: ");
        int n = scanner.nextInt();
        double[] vector = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Informe o valor " +i+ " do vetor: ");
            vector[i] = scanner.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++){
            sum += vector[i];
        }

        double average = sum / n;

        System.out.println("AVERAGE HEIGHT: " + average);

    }

}
