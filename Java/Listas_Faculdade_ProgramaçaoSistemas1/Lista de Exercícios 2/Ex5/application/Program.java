package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de segundos: ");
        int val = sc.nextInt();
        int segundos = 0, minutos = 0, horas = 0;

        System.out.printf("%d : %d : %d", horas,minutos,segundos);


    }
}
