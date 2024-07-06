import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        int x = entrada.nextInt();
        int y = entrada.nextInt();

        while ((x != 0) && (y != 0)) { // se qualquer um dos dois receber um valor 0, o programa encerra.
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            x = entrada.nextInt();
            y = entrada.nextInt();
        }
        entrada.close();
    }
}