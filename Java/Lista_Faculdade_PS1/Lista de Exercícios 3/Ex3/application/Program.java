package application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int posição = 0, maior = 0;
        System.out.println("Insira os 10 números inteiros do vetor.");
        for (int i = 0; i < 10; i++) {
            vet[i] = sc.nextInt();
        }
        for (int i : vet) {
            if (i > maior) {
                maior = i;
            }
        }
        for (int i= 0; i < vet.length; i++) {
            if (vet[i] == maior) {
                posição = i+1;
            }
        }
        System.out.println("Arranjo: " + Arrays.toString(vet));
        System.out.printf("O maior valor é %d ocupando a %d° posição do arranjo.", maior, posição);
    }
}
