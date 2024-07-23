import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();
        int DIFERENÇA = A * B - C * D;

        System.out.printf("DIFERENÇA = %d", DIFERENÇA);
        entrada.close();
    }
}