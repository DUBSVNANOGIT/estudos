package application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de elementos do conjunto: ");
        int n = sc.nextInt();
        int[] vet = new int[n];
        for(int i =0; i < n; i++) {
            System.out.printf("Informe o %d° elemento: ", i+1);
            vet[i] = sc.nextInt();
        }
        System.out.println("Dados na ordem original: " + Arrays.toString(vet));
        for(int i = 0; i < vet.length - 1; i++) {
            if (vet[i] == 0 && vet[i + 1] != 0) {
                vet[i] = vet[i + 1];
                vet[i + 1] = 0;
            }
        }
        System.out.println("Dados reorganizados....: " + Arrays.toString(vet));

    }
}
