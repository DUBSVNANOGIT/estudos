package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.printf(" %.1f ", vect [i]);
        }
        double soma = 0, media;
        for (int i =0; i < vect.length; i++) {
            soma += vect[i];
        }
        media = soma / vect.length;
        System.out.println("\nSOMA: " + soma);
        System.out.println("MEDIA: " + media);
        sc.close();

    }
}
