package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de segundos: ");
        int val = sc.nextInt();
        int segundo = val / 60;
        int minutos = segundos / 60;
        int horas = (minutos) /60;
        System.out.println(horas + " " + minutos + " " + segundos);

    }
}
