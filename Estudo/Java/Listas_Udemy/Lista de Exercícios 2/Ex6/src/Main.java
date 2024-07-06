import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double x = entrada.nextDouble();

        if (x > 0.1 && x < 25.0) {
            System.out.println("Intervalo (0,25)");
        } else if (x > 25.1 && x < 50.0) {
            System.out.println("Intervalo (25,50)");
        } else if (x > 50.1 && x < 75.0) {
            System.out.println("Intervalo (50,75");
        } else if (x > 75.1 && x < 100.0) {
            System.out.println("Intervalo (75,100)");
        } else {
            System.out.println("Valor inválido!");
        }
    }
}