package neliosudemy.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho da matriz");
        int number = scanner.nextInt();

        int[][] matriz = new int[number][number];

        for(int i = 0; i < matriz.length; i++){
            System.out.println("Input: ");
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for(int i=0; i<matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }
        int count = 0;
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if(matriz[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("\n Negative numbers: " +count);

    }

}
