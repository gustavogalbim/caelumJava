package neliosudemy.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de numeros: ");
        int numbers = scanner.nextInt();

        int[] vector = new int[numbers];
        for (int i = 0; i < vector.length; i++){
            scanner.nextLine();
            System.out.println("Digite um numero: ");
            vector[i] = scanner.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for (int i = 0; i < vector.length; i++){
            if (vector[i] < 0) {
                System.out.println(vector[i]);
            }
        }

    }
}
