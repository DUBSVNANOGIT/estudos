package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i <matriz.length; i++) {
            for(int j =0; j <matriz[i].length; j++) {
               System.out.println("Digite o valor");
               matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal principal");
        for (int i  =0; i< n; i++){
            System.out.print(matriz[i][i] + " ");
        }

        int count = 0;
        for (int i = 0; i <matriz.length; i++) {
            for(int j=0; j<matriz[i].length;j++) {
                if (matriz[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Números negativos = " + count);

        sc.close();
    }
}
