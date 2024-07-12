package application;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double media = 0;
        double[] vet = new double[n];
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um número: ");
            vet[i]= sc.nextDouble();
            media += vet[i];
        }
        media = media / n;
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < media) {
                System.out.println(vet[i]);
            }
        }
        sc.close();
    }
}
