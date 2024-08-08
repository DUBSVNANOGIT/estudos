package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(1/2 + 2/2-1 + 3/2-2 + 2-2/3 + 2-1/2 + 2);

        double s = 0;
        s += 1 / n;
        for (int i = 1; i<n; i++) {
            s += i / n - (i - 1);
            for (int j = 1; j < n; j++) {
                s += n - (j - 1) / j;
            }
        }
        s += n;
        System.out.println(s);

    }
}
