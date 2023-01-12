package neliosudemy.exercicios;

import neliosudemy.model.Product;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
/*
Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque)
Em seguida:
- Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
- Realizar uma entrada no estoque e mostrar novamente os dados do produto
- Realizar uma saída no estoque e mostrar novamente os dados do produto
 */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = scanner.nextLine();
        System.out.println("Price: ");
        product.price = scanner.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = scanner.nextInt();

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
