import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double valor = entrada.nextDouble();
        double imposto;


        if (valor <= 2000) { //se o salario for menor que 2000 o imposto é de 0.0
            imposto = 0.0;
        }
        else if (valor <= 3000) { //de 2000 até 3000
            imposto = (valor - 2000) * 0.08; // o imposto é diminuido 2000 e aplicado a porcentagem de 8%
        } else if (valor <= 4500.0) { // se menor que 4500
            imposto = (valor - 3000.0) * 0.18 + 1000.0 * 0.08; // é retirado 3000 e aplicado a porcentagem de 18% + (MAIS) 1000 multiplicado pela porcentagem de 8. Assim se o valor for maior que 3000 porém menor que 4500, o excedente também é taxado.
        } else {
            imposto = (valor = 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08; // se nenhuma das opções forem cumpridas, o valor é maior que 4500, então é igualado a 4500 multiplicado pela porcentagem de 28 + 1500 multiplicado pela porcentagem de 18 e somado também mais 1000 multiplicado pela porcentagem de 8. Assim todas as bases tarifárias que foram ultrapassadas são adicionadas no valor do imposto.
}

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf(" R$ %.2f%n", imposto);
        }


        entrada.close();
    }
}