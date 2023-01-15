package neliosudemy.exercicios;

import neliosudemy.model.Account;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number: ");
        Integer accountNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter holder name: ");
        String holderName = scanner.nextLine();

        System.out.println("Is there a initial deposit (y/n) ?");
        char initialDeposit = scanner.next().charAt(0);

        Account account = new Account(accountNumber, holderName);

        if(account.isInitialDeposit(initialDeposit)){
            System.out.println("Enter initial deposit value: ");
            double initialDepositValue = scanner.nextDouble();
            account.initialDeposit(initialDepositValue);
        }

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println("Enter a deposit value: ");
        double depositValue = scanner.nextDouble();
        account.depositValue(depositValue);

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println("Enter a withdraw value: ");
        double withdraw = scanner.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Updated account data: ");
        System.out.println(account);

    }
}
