package application;


import java.util.Scanner;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int linha = sc.nextInt();
        int coluna = sc.nextInt();
        int colunaB = sc.nextInt();
        int[][] A = new int[linha][coluna];
        int[][] B = new int[coluna][colunaB];
        int[][] C = new int[linha][colunaB];
        for (int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++){
                A[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++){
                B[i][j] = random.nextInt(10);
            }
        }
       for (int i = 0; i < linha;i++) {
           for (int j=0; j < coluna; j++) {
               C[i][j] += A[i][j] * B[i][j];
           }
       }
       System.out.println("A");
       imprimirMatriz(A);
       System.out.println("B");
       imprimirMatriz(B);
       System.out.println("C");
       imprimirMatriz(C);
}
    static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
