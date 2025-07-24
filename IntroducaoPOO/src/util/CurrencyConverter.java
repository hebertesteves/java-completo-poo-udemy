package util;

public class CurrencyConverter {

    public static double IOF = 6.0;

    public static double dollarToReal(double amount, double dollarPrice) {
        return (amount * dollarPrice * (100 + IOF)) / 100;
    }
}
