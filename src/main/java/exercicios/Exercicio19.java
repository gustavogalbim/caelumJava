package exercicios;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o primeiro numero");
        int number1 = scanner.nextInt();

        System.out.println("Escreva o segundo numero");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("ordem decrescente " +number1+ " ," +number2);
        } else {
            System.out.println("ordem decrescente " +number2+ " ," +number1);
        }

    }

}
