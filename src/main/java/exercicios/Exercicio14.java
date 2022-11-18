package exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        float hora;
        int numeroHorasTrabalhadas;
        float totalSalario;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da hora");
        hora = sc.nextFloat();
        System.out.println("Informe a quantidade de horas trabalhadas");
        numeroHorasTrabalhadas = sc.nextInt();

        totalSalario = hora * numeroHorasTrabalhadas;
        System.out.println("O salario referido a esse mes é de: " +totalSalario);

    }
}
