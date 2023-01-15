package neliosudemy.exercicios;

import neliosudemy.model.Product;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3a {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Price: ");
        double price  = scanner.nextDouble();

        Product product = new Product(name, price);

        System.out.println("Product data: " +product + "\n");
        System.out.println("Enter the number of products to be added in stock: ");

        int quantity = scanner.nextInt();
        product.addProducts(quantity);
        System.out.println("Update data: " +product + "\n");

        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);
        System.out.println("Update data: " +product + "\n");

        scanner.close();
    }
}
