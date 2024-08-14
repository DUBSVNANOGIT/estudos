package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1. Alimento não-perecível
                \n 2., 3. ou 4. Alimento perecível
                \n 5. ou 6. Vestuário
                \n 7. Higiene Pessoal
                \n 8., 9. 10. Utensílios domésticos
                """);
        int op = sc.nextInt();
        if (op == 1) {
            System.out.println("Alimento não-perecível");
        }
        else if (op >= 2 && op <= 4) {
            System.out.println("Aliemento perecível");
        }
        else if (op >= 5 && op <= 6) {
            System.out.println("Vestuário");
        }
        else if (op == 7 ) {
            System.out.println("Higiene Pessoal");
        }
        else if (op >= 8 && op <= 10) {
            System.out.println("Utensílios domésticos");
        }
        else {
            System.out.println("Categoria Inválida");
        }

    }
}
