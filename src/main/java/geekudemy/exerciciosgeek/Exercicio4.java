package geekudemy.exerciciosgeek;

import java.util.Scanner;

public class Exercicio4 {

    // Exemplo while e do while
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer idade = 1;
        String nome;

        while (idade > 0) {
            System.out.println("Informe seu nome: ");
            nome = scanner.nextLine();
            System.out.println("Informe sua idade");
            idade = Integer.parseInt(scanner.nextLine());

            System.out.println(nome + " tem " +idade+ " anos");
        }
    }
}
