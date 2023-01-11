package geekudemy.exerciciosgeek;

import java.util.Scanner;

public class Exercicio6 {
    // Exemplo de for

    public static void main(String[] args) {
        int idade;
        String nome;

        Scanner scanner = new Scanner(System.in);
        // variável de controle; condição de parada; forma de incremento;
        for (int i =0; i < 5; i++) {
            System.out.println("Informe o nome: ");
            nome = scanner.nextLine();

            System.out.println("Informe a idade: ");
            idade = Integer.parseInt(scanner.nextLine());

            if (idade > 0) {
                System.out.println(nome + " tem " + idade + " anos.");
            }
        }

    }
}
