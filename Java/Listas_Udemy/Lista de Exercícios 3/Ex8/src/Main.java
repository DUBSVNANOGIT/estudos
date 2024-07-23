import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt(); // o número que será fatorado
        int fat = 1; // determino uma variavel fatorante que começa com 1

        for (int i = 1; i <= N; i++) {
            fat = fat * i; // enquanto i for menor ou igual a N, fat será multiplicado por todos os valores de i
        }
        System.out.println(fat);
        entrada.close();
    }
}