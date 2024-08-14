package application;

import java.util.Scanner;

public class Program {
    static double media(double n1, double n2, double n3, int peso1, int peso2, int peso3) {
        return ((n1 * peso1) + (n2 * peso2) + (n3 * peso3)) / (peso1 + peso2 + peso3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3;
        int peso1, peso2, peso3;
        System.out.println("Inform e as três notas: ");
        System.out.print("Nota 1: ");
        n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        n3 = sc.nextDouble();
        System.out.println("Informe os pesos das avaliações: ");
        System.out.print("Peso 1: ");
        peso1 = sc.nextInt();
        System.out.print("Peso 2: ");
        peso2 = sc.nextInt();
        System.out.print("Peso 3: ");
        peso3 = sc.nextInt();
        System.out.println("A média ponderada é: " + media(n1,n2,n3,peso1,peso2,peso3));

    }
}
