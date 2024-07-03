import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int codPeca1 = entrada.nextInt();
        int qtdePeca1 = entrada.nextInt();
        double valorUnitarioPeca1 = entrada.nextDouble();

        int codPeca2 = entrada.nextInt();
        int qtdePeca2 = entrada.nextInt();
        double valorUnitarioPeca2 = entrada.nextDouble();

        double TOTAL = (qtdePeca1 * valorUnitarioPeca1) + (qtdePeca2 * valorUnitarioPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", TOTAL);
    }
}