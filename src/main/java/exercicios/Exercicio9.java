package exercicios;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu usuario: ");
        String name = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String password = sc.nextLine();

        if(name.equals(password)){
            System.out.println("O usuario e senha não podem ser iguais.");

            System.out.println("Digite seu usuario: ");
            sc.nextLine();
            System.out.println("Digite sua senha: ");
            sc.nextLine();
        }


    }
}


