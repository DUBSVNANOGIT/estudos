package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Preço da etiqueta do produto: ");
        double PE = sc.nextDouble();
        System.out.println("Condição de Pagamento");
        System.out.println("1. À vista em dinheiro ou cheque, com 10% de desconto: %.2f.");
        System.out.println("2. À vista com cartão de crédito, com 5% de desconto");
        System.out.println("3. Em 2 vezes, preço normal de etiqueta sem juros");
        System.out.println("4. Em 3 vezes, preço de etiqueta sem juros");
        System.out.println("Selecione uma das opções: ");
        int CP = sc.nextInt();
        if (CP == 1) {
            PE -= (PE * 0.10);
        }
        else if (CP == 2) {
            PE -= (PE * 0.05);
        }
        else if (CP == 3) {
            PE *= 1;
        }
        else if (CP == 4) {
            PE += 10;
        }
        else {
            System.out.println("Valor inválido");
        }
        System.out.printf("Opção selecionada %d. Total: %.2f", CP, PE);
    }
}
