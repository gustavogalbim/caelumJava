package exercicios;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Esse numero é par.");
        } else {
            System.out.println("Esse numero é impar");
        }
    }
}
