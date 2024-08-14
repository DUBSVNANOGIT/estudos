package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o tamanho da matriz M:    ");
        System.out.print("Qtde de linhas: ");
        int N = sc.nextInt();
        System.out.print("Qtde de colunas: ");
        int M = sc.nextInt();
        boolean[][] matriz = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i == j) {
                    matriz[i][j] = false;
                } else {
                    matriz[i][j] = true;
                }
            }
        }
        System.out.printf("A matriz booleana M_%dx%d terá o seguinte conteúdo: \n", N, M);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
