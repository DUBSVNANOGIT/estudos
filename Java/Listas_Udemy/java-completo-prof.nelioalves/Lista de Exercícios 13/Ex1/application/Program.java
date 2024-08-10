package application;



import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> C = new HashSet<>();
        Set<Integer> total = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int aluno = sc.nextInt();
            A.add(aluno);
        }

        total.addAll(A);

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int aluno = sc.nextInt();
            B.add(aluno);
        }

        total.addAll(B);

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int aluno = sc.nextInt();
            C.add(aluno);
        }

        total.addAll(C);

        System.out.print("Total students: " + total.size());

        sc.close();

    }
}
