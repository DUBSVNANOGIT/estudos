package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt(), counter = 0;
        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
           vetor[i] = sc.nextInt();
        }
        System.out.println("NÙMEROS PARES: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(" " + vetor[i] + " ");
                counter++;
            }
        }
        System.out.printf("\nQUANTIDADE DE PARES = %d", counter);
        sc.close();
    }
}
