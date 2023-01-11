package caelum.exercicios;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o usuario");
        String nome = scanner.next().toLowerCase();
        System.out.println("Digite a senha");
        String senha = scanner.next().toLowerCase();

        if(nome.equals("gustavo") && senha.equals("123")) {
            System.out.println("Logado com sucesso");
        } else {
            System.out.println("Senha invalida.");
        }

    }
}
