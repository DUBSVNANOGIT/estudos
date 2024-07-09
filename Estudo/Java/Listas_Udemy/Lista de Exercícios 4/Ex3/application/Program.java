package application;

import entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estudante est = new Estudante();

        System.out.println("Digite o nome do estudante: ");
        est.nome = sc.nextLine();

        System.out.println("Digite as notas :");
        est.semestreUm = sc.nextDouble();
        est.semestreDois = sc.nextDouble();
        est.semestreTres = sc.nextDouble();

        est.veredito();
        sc.close();
    }
}
