package exercicios;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o primeiro numero");
        int number1 = scanner.nextInt();

        System.out.println("Escreva o segundo numero");
        int number2 = scanner.nextInt();

        int diferenca = number1 - number2;

        System.out.println("A diferença entre os dois numeros é " + Math.abs(diferenca));

    }

}
