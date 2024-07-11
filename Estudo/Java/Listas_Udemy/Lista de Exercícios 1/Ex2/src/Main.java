import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int raio = entrada.nextInt();
        double pi = 3.13159;
        double area = pi * Math.pow(raio, 2);

        System.out.printf("A = %.4f", area);
        entrada.close();
    }
}
