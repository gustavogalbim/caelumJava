package exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        int qtdMin;
        int qtdMax;
        float estoqueMedia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade minima");
        qtdMin = sc.nextInt();
        System.out.println("Informe a quantidade maxima");
        qtdMax = sc.nextInt();

        estoqueMedia = qtdMin + qtdMax / 2;
        System.out.println("A media do estoque é: "+estoqueMedia);

    }

}
