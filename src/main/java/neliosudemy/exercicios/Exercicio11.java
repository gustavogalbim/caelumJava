package neliosudemy.exercicios;

import neliosudemy.model.Products;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor: ");
        int n = scanner.nextInt();
        Products[] vector = new Products[n];

        for (int i =0; i < vector.length; i++){
            scanner.nextLine();
            System.out.println("Informe o nome: ");
            String name = scanner.nextLine();
            System.out.println("Informe o preço: ");
            double price = scanner.nextDouble();
            vector[i] = new Products(name, price);
        }

        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i].getPrice();
        }

        double average = sum / vector.length;
        System.out.println("AVERAGE PRICE = " + average);
    }

}
