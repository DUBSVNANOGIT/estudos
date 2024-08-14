package application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os dados do conjunto (10 valores inteiros):");
        int[] vet = new int[10];
        for(int i = 0; i < 10; i++) {
            vet[i] = sc.nextInt();
        }
        System.out.print("Valor a ser pesquisado: ");
        int valor = sc.nextInt(), posição = 0;
        for (int i = 0; i < 10; i++){
            if (vet[i] == valor) {
                posição = i;
            }
        }
        System.out.println("Conteúdo do vetor: " + Arrays.toString(vet));
        System.out.printf("O valor %d está na posição de índice %d.", valor, posição);
    }
}
