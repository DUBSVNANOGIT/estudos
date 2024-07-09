package application;
import entities.Funcionario;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        funcionario.nome = sc.nextLine();
        funcionario.salarioBruto = sc.nextDouble();
        funcionario.imposto = sc.nextDouble();
        System.out.println("Funcionario: " + funcionario);
        System.out.println("Qual a porcentagem de aumento? ");
        funcionario.aumentoSalario(sc.nextDouble());
        System.out.println("Informações atualizadas: " + funcionario);
        sc.close();
    }

}
