package caelum.exercicios;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        int num1;
        int num2;
        int soma;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        num1 = sc.nextInt();
        System.out.println("Informe o segundo numero");
        num2 = sc.nextInt();

        soma = num1 + num2;
        System.out.println("A soma desses dois numeros é: " +soma);

    }

}
