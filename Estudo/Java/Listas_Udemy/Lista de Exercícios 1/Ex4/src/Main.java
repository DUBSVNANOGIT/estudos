import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int nFuncionario = entrada.nextInt();
        int horas = entrada.nextInt();
        double vHora = entrada.nextDouble();

        double salario = vHora * horas;

        System.out.printf("NUMBER = %d%n", nFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);
        entrada.close();

    }
}
