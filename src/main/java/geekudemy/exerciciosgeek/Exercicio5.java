package geekudemy.exerciciosgeek;

import java.util.Scanner;

public class Exercicio5 {

    // Exemplo de DO WHILE
    public static void main(String[] args) {

        int idade;
        String nome;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Informe seu nome: ");
            nome = scanner.nextLine();

            System.out.println("Informe sua idade: ");
            idade = Integer.parseInt(scanner.nextLine());

            System.out.println(nome + " tem " +idade+ " anos.");
        } while (idade > 0);


    }
}
