package util;

public class CurrencyConverter {
    public static double Dolar = 0;

    public static double conversor(double quantity) {
        double valor = quantity * Dolar;
        return valor + (valor * 0.06);
    }
}
