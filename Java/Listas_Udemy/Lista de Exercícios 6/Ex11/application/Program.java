package application;
import java.util.Scanner;
import java.util.Locale;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt(), nHomens = 0, counter = 0;
        double[] alturas = new double[n];
        char[] pessoas = new char[n];
        double menorAltura, maiorAltura, mediaAM = 0;
        for(int i = 0; i < n; i++) {
            System.out.printf("Altura da %d° pessoa ", i+1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Gênero da %d° pessoa ", i+1);
            pessoas[i] = sc.next().charAt(0);
        }

        menorAltura = alturas[0];
        maiorAltura = alturas[0];

        for(int i = 0; i<n; i++) {
            if(alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }

        }
        for(int i = 0; i<n; i++) {
            if (pessoas[i] == 'F'){
                mediaAM += alturas[i];
            } else if (pessoas[i] == 'M') {
                nHomens++;
            }
        }
        for(int i = 0; i<n; i++) {
            if (pessoas[i] == 'F'){
                counter++;
            }
        }
        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAM / counter);
        System.out.printf("Número de homens = %d", nHomens);

    }
}
