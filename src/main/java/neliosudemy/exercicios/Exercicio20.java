package neliosudemy.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho da matriz: ");

        int line = scanner.nextInt();
        int column = scanner.nextInt();

        int matriz[][] = new int[line][column];
        for (int i=0; i<matriz.length; i++) {
            System.out.println("Input matriz " +i);
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Informe o numero aleatorio: ");
        int x = scanner.nextInt();

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j< matriz.length; j++) {
                if(matriz[i][j] == x) {
                    System.out.println("Position " +i+ "," +j+ ":");
                    if(j > 0) {
                        System.out.println("Left: " +matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Upper: " +matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Right: " +matriz[i][j+1]);
                    }
                    if(i < matriz.length -1) {
                        System.out.println("Down: " +matriz[i+1][j]);
                    }
                }
            }
        }

    }

}
