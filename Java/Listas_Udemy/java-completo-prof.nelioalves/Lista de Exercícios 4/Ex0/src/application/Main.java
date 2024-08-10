package src.application;
import src.entities.Triangulo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("Digite as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        if (areaX > areaY) {
            System.out.println("O maior triângulo é: X");
        }
        else {
            System.out.println("O maior triângulo é: Y");
        }

        sc.close();
    }
}