package application;

import entities.Funcionario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os dados do colaborador:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Função: ");
        String funcao = sc.nextLine();
        System.out.print("Salário: R$ ");
        double salario = sc.nextDouble();
        Funcionario f1 = new Funcionario(nome, funcao, salario);
        System.out.print("Informe a taxa de aumento (em %): ");
        double taxa = sc.nextDouble();
        f1.atualizarSalario(taxa);
        System.out.printf("O novo salariodo %s será de R$ %.2f", f1.getNome(), f1.getSalario());
    }
}
