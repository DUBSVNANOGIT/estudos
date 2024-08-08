package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Entrada: ");
            vet[i] = sc.nextInt();
        }
        for(int i : vet){
            sum += i;
        }
        System.out.println("Soma dos valores: " + sum);
    }
}
