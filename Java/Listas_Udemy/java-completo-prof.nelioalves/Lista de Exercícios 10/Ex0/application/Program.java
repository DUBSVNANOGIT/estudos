package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        method2();


        System.out.println("End of Program");
    }

    public static void method1() {
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");

    }

    public static void method2() {
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vetor = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vetor[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
            e.printStackTrace();
            sc.next();
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        System.out.println("End of program");

        sc.close();
        System.out.println("***METHOD2 END***");
    }
}
