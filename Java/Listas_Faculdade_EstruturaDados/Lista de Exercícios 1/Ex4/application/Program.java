package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int[] linha : mat) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        System.out.println(somaDiagonal(mat));
    }
    public static int somaDiagonal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i == j){
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }
}
