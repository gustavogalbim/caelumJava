package neliosudemy.exercicios;

import neliosudemy.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double dollarPrice = scanner.nextDouble();
        System.out.println("How many dollars will be bought?");
        double quantityDollar = scanner.nextDouble();

        double resultAmount = CurrencyConverter.currencyConverter(dollarPrice, quantityDollar);
        System.out.println("Amount to be paid in real = R$" +resultAmount);

    }
}
