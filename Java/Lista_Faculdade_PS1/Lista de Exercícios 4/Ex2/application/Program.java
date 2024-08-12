package application;

import java.util.Scanner;

public class Program {
    static int soma(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(soma(a,b));
    }
}
