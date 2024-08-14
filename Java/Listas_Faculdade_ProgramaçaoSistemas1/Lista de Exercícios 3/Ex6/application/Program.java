package application;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Defina a quantidade de elementos do vetor: ");
        int n = sc.nextInt();
        int[] vet = new int [n];
        for(int i = 0; i < vet.length;i++){
            System.out.println("Entrada:");
            vet[i] = sc.nextInt();
        }
        Arrays.sort(vet);
        System.out.println("Vetor em ordem crescente utilizando Arrays.sort(): " + Arrays.toString(vet));
    }

}
