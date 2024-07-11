import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();

        if (x < 0 ) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÂO NEGATIVO");
        }
        entrada.close();
    }
}
