import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        float A = entrada.nextFloat();
        float B = entrada.nextFloat();
        float C = entrada.nextFloat();

        double a = (A * C)/2;
        double b = 3.14159 * Math.pow(C, 2);
        double c = (A + B) * C / 2;
        double d = Math.pow(B, 2);
        double e = A * B;

        System.out.printf("TRIANGULO: %.3f%n", a);
        System.out.printf("CIRCULO: %.3f%n", b);
        System.out.printf("TRAPEZIO: %.3f%n", c);
        System.out.printf("QUADRADO: %.3f%n", d);
        System.out.printf("RETÂNGULO: %.3f%n", e);
        entrada.close();
    }
}
