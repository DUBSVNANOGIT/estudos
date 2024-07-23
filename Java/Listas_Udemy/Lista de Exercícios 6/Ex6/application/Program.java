package application;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Quantos valores vai ter cada vetor? ");
       int n = sc.nextInt();
       int[] A = new int[n] , B = new int[n], C = new int[n];
       for (int i = 0; i < n; i++ ) {
           System.out.println("Digite os valores do vetor A: ");
           A[i] = sc.nextInt();
           C[i] = A[i];
       }
       for (int i = 0; i < n ; i++) {
           System.out.println("Digite os valores do vetor B: ");
           B[i] = sc.nextInt();
           C[i] += B[i];
       }
       System.out.println("VETOR RESULTANTE: ");
       for (int i = 0; i < n; i++) {
           System.out.println(C[i]);
       }
       sc.close();
    }
}
