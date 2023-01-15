package neliosudemy.util;

public class CurrencyConverter {

    public static double currencyConverter (double priceDollar, double quantity) {
        double amount = priceDollar * quantity;
        double paymentIOF = amount * 6 / 100;

        return amount - paymentIOF;
    }

}
