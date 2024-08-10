import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int alcool = 0;
        int diesel = 0;
        int gasolina = 0;
        int opt = entrada.nextInt();

        while (opt != 4) {
            if (opt == 1) {
                alcool++;
            }
            else if (opt == 2) {
                gasolina++;
            }
            else if (opt == 3) {
                diesel++;
            }
            opt = entrada.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        entrada.close();
    }
}