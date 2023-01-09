package exerciciosgeek;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        int quantidade;
        ArrayList<String> frutas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de frutas: ");
        quantidade = Integer.parseInt(scanner.nextLine());
        System.out.println("A quantidade selecionada é " +quantidade+ ".");

        if(quantidade == 1) {
            System.out.println("Informe a fruta: ");
            frutas.add(scanner.nextLine().toUpperCase());
            System.out.println("A fruta selecionada é: " +frutas);
        } else {
            System.out.println("Informe as frutas: ");
            for (int i = 0; i < quantidade; i++) {
                System.out.println("A " +(i+1)+ " fruta:");
                frutas.add(scanner.nextLine().toUpperCase());
                System.out.println("As frutas selecionadas são: " +frutas);
            }
        }
    }
}
