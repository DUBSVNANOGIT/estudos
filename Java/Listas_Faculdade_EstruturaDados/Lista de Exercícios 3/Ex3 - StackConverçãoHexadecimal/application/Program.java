package application;

import java.util.Stack;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro (diferente de 0)");
		Integer num = sc.nextInt();
        if (num != 0) {
            Stack <Integer> dados = new Stack();
            while (num > 0) {
                dados.push(num % 16);
                num = num / 16;
            }
            while (!dados.empty()) {
                String msg = Integer.toHexString(dados.pop()).toUpperCase();
                System.out.print(msg + " ");
            }

        }
    }
}

