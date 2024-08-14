package applicationb;

import java.util.Scanner;

public class Program {
    public static final double pi = 3.14159;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("raio: ");
        double raio = sc.nextDouble();
        System.out.print("altura: ");
        double altura = sc.nextDouble();

        System.out.println("volume: pi * raio² * altura");
        System.out.printf("\n volume: %.5f * %.2f * %.2f", pi, raio * raio, altura);

    }


}
