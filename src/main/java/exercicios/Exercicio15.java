package exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        double altura;
        double calculaPeso;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a sua altura");
        altura = sc.nextDouble();

        calculaPeso = altura * 72.7 - 58;
        System.out.println("O peso ideal para sua altura é de "+calculaPeso+ " kgs");
    }
}
