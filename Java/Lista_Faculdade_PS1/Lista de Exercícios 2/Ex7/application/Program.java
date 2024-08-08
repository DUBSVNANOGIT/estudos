package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //o MDC de dois números inteiros é o maior número inteiro que divide ambos sem deixar resto.
        //o MDC não muda se o menor número for subtraido pelo maior.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        System.out.println(a);
    }
}
