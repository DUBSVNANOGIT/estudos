package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double s = 0.0;
        for (int i = 1; i<=n; i++) {
            s += i / (n - (i - 1.0));
        }
        System.out.println(s);

    }
}
