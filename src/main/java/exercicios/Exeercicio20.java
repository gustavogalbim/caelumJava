package exercicios;

import java.util.Scanner;

public class Exeercicio20 {

    public static void main(String[] args) {

        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a variavel numerica");
        number = sc.nextInt();

        if(number > 100){
            System.out.println("o valor é: " +number);
        } else {
            number = 0;
            System.out.println("o valor é: " +number);
        }

    }

    // parei no 124
}
