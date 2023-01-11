package caelum.exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        int metro;
        int cm;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a metragem");
        metro = sc.nextInt();

        cm = metro * 100;
        System.out.println("A conversão para essa quantidade de " +metro+ " metros é de " +cm+ " centimetros");

    }
}
