import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        float x = entrada.nextFloat();
        float y = entrada.nextFloat();

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x == 0 && y == 0 ){
            System.out.println("Origem");
        } else {
            System.out.println("Valor Inválido");
        }
        entrada.close();
    }
}
