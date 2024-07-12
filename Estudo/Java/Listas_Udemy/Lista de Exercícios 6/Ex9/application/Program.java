package application;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas você gostaria de digitar? ");
        int n = sc.nextInt(), velha = 0, pVelha =0;
        String[] nomes = new String[n];
        int[] idade = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %d° pessoa: ", i + 1);
            sc.nextLine();
            System.out.println("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.println("Idade: ");
            idade[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (idade[i] > velha) {
                velha = idade[i];
                pVelha = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + nomes[pVelha]);
        sc.close();
    }
}
