package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double nMaior;
        int pMaior;
        double[] vet = new double[n];

        for (int i = 0; i < vet.length; i ++) {
            System.out.println("Digite um número: ");
            vet[i] = sc.nextDouble();
        }
        nMaior = vet[0];
        pMaior = 0;

        for (int i = 0; i < vet.length + 1; i++) {
            if (vet[i] > nMaior) { //a comparação é feita com a variável, não com o vetor na posição [i]
                nMaior = vet[i];
                pMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n", nMaior);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d", pMaior);

        sc.close();
    }
}
