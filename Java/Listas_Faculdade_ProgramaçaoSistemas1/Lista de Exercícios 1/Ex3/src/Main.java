import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        String nome = entrada.next();
        System.out.printf("Olá, Sr. %s, é um prazer conhecê-lo", nome);
        entrada.close();
    }
}