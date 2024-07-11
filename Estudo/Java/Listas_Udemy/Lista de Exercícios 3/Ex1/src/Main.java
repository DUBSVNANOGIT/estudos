import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int senhaCorreta = 2002;
        int senha = entrada.nextInt();
        while (senha != senhaCorreta) {
            System.out.println("Senha inválida");
            senha = entrada.nextInt();
        }
        System.out.println("Acesso Permitido");
        entrada.close();
    }
}
