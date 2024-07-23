package application;
import java.util.Scanner;
import java.util.Locale;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       System.out.println("Quantos elementos vai ter o vetor? ");
       int n = sc.nextInt(), counter = 0;
       double media = 0;
       int[] vet = new int[n];
       for (int i = 0; i < vet.length; i++) {
           System.out.println("Digite um número: ");
           vet[i] = sc.nextInt();
           if (vet[i] % 2 == 0 ) {
               media += vet[i];
               counter++;
           }
        }
       if (counter == 0) {
           System.out.println("NENHUM NÚMERO PAR");
       } else {
           media /= counter;
           System.out.printf("MÉDIA DOS PARES = %.1f", media);
       }
       sc.close();
    }
}
