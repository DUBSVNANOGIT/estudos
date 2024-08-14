package application;

import java.util.Scanner;

public class Program {
    static double celsiusToFahrenheit(double C) {
        return (C * (9.0 / 5.0)) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double C = sc.nextDouble();
        double F = celsiusToFahrenheit(C);
        System.out.println("A temperatura em Fahrenheit é : " + F + "°.");
    }
}
