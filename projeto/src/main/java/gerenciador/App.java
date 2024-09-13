package gerenciador;

import java.util.*;
import java.sql.SQLException;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        ContasRepo repo = new ContasRepo();
        System.out.println("Menu");
        System.out.println("(1) Criar nova Conta");
        System.out.println("(2) Ler todas as contas");
        System.out.println("(3) Ler dados de uma Conta");
        System.out.println("(4) Alterar os dados de uma Conta");
        System.out.println("(5) Apagar uma Conta");
        System.out.println("(0) Sair");
        System.out.print("Escolha umn opção:    ");
        int op = sc.nextInt();
        while (op != 0) {
            if (op == 1) {
                // CREATE
                System.out.println("Digite o número da conta: ");
                int numero = sc.nextInt();
                System.out.println("Digite o nome do titular: ");
                String titular = sc.next();
                System.out.println("Digite o saldo inicial: ");
                double saldo = sc.nextDouble();
                Conta conta = new Conta(numero, titular, saldo);
                int n = repo.criar(conta);
                if (n != -1) {
                    System.out.println("Conta criada com sucesso!");
                }
            }
            else if (op == 2) {
                List<Conta> contas = repo.lerTodas();
                for (Conta c : contas) {
                    System.out.println("# a conta " + c.getNumero() + " pertence a " + c.getTitular() + " e tem R$ " + c.getSaldo());
                }
            }
            else if (op ==3) {
                System.out.print("Digite o número da conta: ");
                int numero = sc.nextInt();
                Conta c2 = repo.read(numero);
                System.out.println("# a conta " + c2.getNumero() + " pertence a " + c2.getTitular() + " e tem R$ " + c2.getSaldo());
            }
            else if (op == 4) {
                System.out.print("Digite o número da conta: ");
                int numero = sc.nextInt();
                Conta c3 = repo.read(numero);
                int n2 = repo.update(c3);
                if (n2 != -1) {
                    System.out.println("Conta alterada!");
                }
            }
            else if (op == 5) {
                System.out.print("Digite o número da conta: ");
                int numero = sc.nextInt();
                int n3 = repo.delete(numero);
                if (n3 != -1) {
                    System.out.println("Conta alterada!");
                }
            }

            System.out.println("Menu");
            System.out.println("(1) Criar nova Conta");
            System.out.println("(2) Ler todas as contas");
            System.out.println("(3) Ler dados de uma Conta");
            System.out.println("(4) Alterar os dados de uma Conta");
            System.out.println("(5) Apagar uma Conta");
            System.out.println("(0) Sair");
            System.out.print("Escolha umn opção:    ");
            op = sc.nextInt();
        }

        // CREATE
        Conta conta = new Conta(3, "Bob", 40.0);
        int n = repo.criar(conta);
        System.out.println(n);
        
        // READ
        Conta c2 = repo.read(2);
        System.out.println("# a conta " + c2.getNumero() + " pertence a " + c2.getTitular() + " e tem R$ " + c2.getSaldo());

        // UPDATE
        int n2 = repo.update(conta);
        System.out.println(n2);

        // DELETE
        int n3 = repo.delete(2);
        System.out.println(n3);


    }
}
