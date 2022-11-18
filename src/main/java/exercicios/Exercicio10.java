package exercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        int num1;
        int num2;
        int soma;
        int multiplicacao;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Informe o segundo numero: ");
        num2 = sc.nextInt();

        soma = num1 + num2;
        multiplicacao = soma * num1;

        System.out.println("O resultado da multiplicacao é : "+multiplicacao);

        }

    }


