import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();

        for (int i = 1; i <= N; i++) {
            double x = entrada.nextInt();
            double y = entrada.nextInt();
            if (y != 0) {
                double divisao = x / y;
                 System.out.printf("%.1f%n", divisao);
            } else {
                System.out.println("divisão impossível");
            }
        }
        entrada.close();
    }
}