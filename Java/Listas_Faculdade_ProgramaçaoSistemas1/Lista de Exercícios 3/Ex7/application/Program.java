package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 2, column = 3;
        int[][] matriz = new int[row][column];
        System.out.println("Entre com os elementos da matriz: ");
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Posição %d, %d: ",i+1,j+1);
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("A matriz original é: ");

        for (int i= 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
               System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
