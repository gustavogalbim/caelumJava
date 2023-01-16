package neliosudemy.exercicios;

import neliosudemy.model.Customer;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de pessoas: ");
        int number = scanner.nextInt();

        Customer[] customers = new Customer[number];

        for (int i = 0; i < customers.length; i++){
            scanner.nextLine();

            System.out.println("Informe o nome: ");
            String name = scanner.nextLine();
            System.out.println("Informe a idade: ");
            int age = scanner.nextInt();
            System.out.println("Informe a altura: ");
            double height = scanner.nextDouble();

            customers[i] = new Customer(name, age, height);
        }

        double sum = 0;
        for (int i = 0; i < customers.length; i++){
            sum += customers[i].getHeight();
        }

        double average = sum / customers.length;
        System.out.println("Altura média: " +average);

        for (int i = 0; i < customers.length; i++){
            if(customers[i].getAge() < 16) {
            }
            double percent = customers.length * 100 / number;
            System.out.println("Pessoas com menos de 16 anos: " + percent + "%");
            System.out.println(customers[i].getName());
        }

    }
}
