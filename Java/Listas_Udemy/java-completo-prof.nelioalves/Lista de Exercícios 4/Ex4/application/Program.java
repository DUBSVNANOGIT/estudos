package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double quantity;

        System.out.println("Digite o valor do dólar: ");
        CurrencyConverter.Dolar = sc.nextDouble();

        System.out.println("Quantos dólares serão compradors? ");
        quantity = sc.nextDouble();

        System.out.printf("Valor a ser pago em reais: %.2f%n", CurrencyConverter.conversor(quantity));


        sc.close();
    }
}
