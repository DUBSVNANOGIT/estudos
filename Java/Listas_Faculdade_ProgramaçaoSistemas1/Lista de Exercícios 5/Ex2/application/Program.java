package application;

import java.util.Locale;
import entities.Triangulo;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Triângulo")
        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        Triangulo triangulo = new Triangulo(base, altura);
        triangulo.area();
    }
}
