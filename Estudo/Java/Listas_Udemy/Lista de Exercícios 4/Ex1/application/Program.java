package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Retangulo;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        System.out.println("Digite a altura e largura do retângulo: ");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();
        System.out.println(retangulo);

        sc.close();
    }
}
