package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Frase ou palavra: ");
        String palavra = sc.nextLine();
        ePalindromo(palavra);
    }

    static void ePalindromo(String str) {
        char[] vet = str.trim().toCharArray();
        int count = 0;
        for (int i = 0; i < (vet.length / 2 ); i++) {
            if (vet[i] == vet[vet.length - (i + 1)]) {
               count++;
            }
        }
        if (count >= (vet.length / 2)) {
            System.out.printf("'%s' é um palíndromo", str);
        }
        else {
            System.out.printf("'%s' não é um palíndromo", str);
        }
    }
}
