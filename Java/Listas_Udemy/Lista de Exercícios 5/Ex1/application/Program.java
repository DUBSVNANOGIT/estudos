package application;
import entities.Conta;

import java.util.Scanner;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;
        double valor;
        System.out.println("Digite o número da conta: ");
        int numConta = sc.nextInt();
        System.out.println("Digite o nome do Usuário: ");
        sc.nextLine();
        String nome = sc.nextLine(); // verificar como fazer para o programa não pular
        System.out.println("Você gostaria de realizar o primeiro depósito? [y/n]");
        char Verificador = sc.next().charAt(0);
        if (Verificador == 'y') {
            System.out.println("Digite o valor do depósito incial: ");
            valor = sc.nextDouble();
            conta =  new Conta(numConta, nome, valor);
        } else {
            conta =  new Conta(numConta, nome, 0.0);
        }
        System.out.println(conta);

        System.out.println("Insira um valor de depósito: ");
        valor = sc.nextDouble();
        conta.depositar(valor);

        System.out.println(conta);
        System.out.println("Insira um valor para saque: ");
        valor = sc.nextDouble();
        conta.sacar(valor);

        System.out.println(conta);
        sc.close();
    }
}
