package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %d° pessoa: ", i + 1);
            System.out.println("NOME: ");
            nome[i] = sc.next();
            System.out.println("IDADE: ");
            idade[i] = sc.nextInt();
            System.out.println("ALTURA: ");
            altura[i] = sc.nextDouble();
        }
        double alturaTotal = 0, menores = 0;
        for (int i = 0; i < n; i++) {
            if(idade[i] < 16) {
                menores++;
            }
            alturaTotal += altura[i];
        }

        System.out.printf("Altura média: %.2f\n", alturaTotal / n);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", ((double) menores / n) * 100);

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.printf("%s\n", nome[i]);
                }
            }

        sc.close();
    }
}
