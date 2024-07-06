import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        for (int i = 0; i < N; i++) {
            double a = entrada.nextDouble();
            double b = entrada.nextDouble();
            double c = entrada.nextDouble();
            double saida = (a * 2 + b * 3 + c * 5) / (2 + 3 + 5);
            System.out.printf("%.1f%n", saida);
        }
        entrada.close();
    }
}