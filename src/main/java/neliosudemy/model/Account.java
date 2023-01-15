package neliosudemy.model;

import lombok.Getter;
import lombok.Setter;

public class Account {

    @Getter
    private Integer accountNumber;
    @Getter @Setter
    private String holderName;
    @Getter
    private double balance;

    public Account(Integer accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public Account(Integer accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void depositValue(final double amount){
        balance += amount;
    }

    public void withdraw(final double amount) {
        double tax = 5.0;
        balance -= amount + tax;
    }

    public void initialDeposit(final double amount) {
        balance += amount;
    }

    public boolean isInitialDeposit(final char initial) {
        return initial == 'y';
    }

    public String toString(){
        return "Account: " + accountNumber
                + ", "
                + "Holder: " + holderName
                + ", "
                + "Balance: $" + String.format("%.2f", balance);
    }

}
