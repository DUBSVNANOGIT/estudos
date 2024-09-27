package gerenciador;

import dao.ContaDao;
import dao.TitularDao;

import java.math.BigDecimal;
import java.sql.Connection;
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
    static ConnectionFactory cf = new ConnectionFactory();
    static String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.xwwanfrmrvlvwrxynxos&password=zowiebowie1*";

    public static void main(String[] args) throws SQLException {
        System.out.println("Selecione uma das operações: ");
        System.out.println("1 - Operações com Titular");
        System.out.println("2 - Operações com Conta");
        System.out.println("0 - Para encerrar");
        int op = sc.nextInt();
        while (op != 0) {
           if (op == 1) {
               menuTitular();
           }
           else if (op == 2) {
               menuConta();
           }
           else {
               System.out.println("Valor inválido");
           }
            System.out.println("Selecione uma das operações: ");
            System.out.println("1 - Operações com Titular");
            System.out.println("2 - Operações com Conta");
            System.out.println("0 - Para encerrar");
            op = sc.nextInt();
        }
    }


    static void menuTitular() {
        TitularDao td = new TitularDao(url);
        System.out.println("Menu");
        System.out.println("(1) Criar novo titular");
        System.out.println("(2) Ler todos os titulares");
        System.out.println("(3) Ler dados de um titular");
        System.out.println("(4) Alterar os dados de um titular");
        System.out.println("(5) Apagar um titular");
        System.out.println("(0) Sair");
        System.out.print("Escolha umn opção:    ");
        int op = sc.nextInt();
        while (op != 0) {
            if (op == 1) {
                System.out.println("Digite o número do titular: ");
                long numero = sc.nextLong();
                System.out.println("Digite o nome do titular: ");
                String nome = sc.nextLine();
                System.out.println("Digite o rg: ");
                String rg = sc.nextLine();
                System.out.println("Digite o cpf: ");
                String cpf = sc.nextLine();
                Titular t = new Titular(numero, nome, rg, cpf);
                if (td.create(t)) {
                    System.out.println("Conta criada com sucesso!");
                }
            }
            else if (op == 2) {
                List<Titular> titulares = td.lerTodas();
                for (Titular c : titulares) {
                    System.out.println(String.format("N°: %ld, Nome: %s, RG: %s, CPF: %s", c.getNroTitular(), c.getNome(), c.getRg(), c.getCpf()));
                }
            }
            else if (op ==3) {
                System.out.print("Digite o número do titular: ");
                long numero = sc.nextLong();
                Titular t = td.readByNumber(numero);
                System.out.println(String.format("N°: %ld, Nome: %s, RG: %s, CPF: %s", t.getNroTitular(), t.getNome(), t.getRg(), t.getCpf()));
            }
            else if (op == 4) {
                System.out.print("Digite o número do titular: ");
                long numero = sc.nextLong();
                Titular t = td.readByNumber(numero);
                if (td.updtate(t)) {
                    System.out.println("Alteração realizada!");
                }
            }
            else if (op == 5) {
                System.out.print("Digite o número do titular: ");
                long numero = sc.nextLong();
                Titular t = td.readByNumber(numero);
                if (td.delete(numero)) {
                    System.out.println("Conta deletada!");
                }
            }

        System.out.println("Menu");
        System.out.println("(1) Criar novo titular");
        System.out.println("(2) Ler todos os titulares");
        System.out.println("(3) Ler dados de um titular");
        System.out.println("(4) Alterar os dados de um titular");
        System.out.println("(5) Apagar um titular");
        System.out.println("(0) Sair");
        System.out.print("Escolha umn opção:    ");
            op = sc.nextInt();
        }
    }

    static void menuConta() {
        ContaDao cd = new ContaDao(url);
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
                System.out.println("Digite o número da conta: ");
                long numero = sc.nextLong();
                System.out.println("Digite o saldo inicial: ");
                BigDecimal saldo = sc.nextBigDecimal();
                Conta conta = new Conta(numero, saldo);
                if (cd.criar(conta)) {
                    System.out.println("Conta criada com sucesso!");
                }
            }
            else if (op == 2) {
                List<Conta> contas = cd.letTodas();
                for (Conta c : contas) {
                    System.out.println("# a conta " + c.getNumero() + " e tem R$ " + c.getSaldo());
                }
            }
            else if (op ==3) {
                System.out.print("Digite o número da conta: ");
                long numero = sc.nextLong();
                Conta c2 = cd.buscarPeloNumero(numero);
                System.out.println("# a conta " + c2.getNumero() + " e tem R$ " + c2.getSaldo());
            }
            else if (op == 4) {
                System.out.print("Digite o número da conta: ");
                long numero = sc.nextLong();
                Conta c3 = cd.buscarPeloNumero(numero);
                if (cd.atualizar(c3)) {
                    System.out.println("Alteração realizada!");
                }
            }
            else if (op == 5) {
                System.out.print("Digite o número da conta: ");
                long numero = sc.nextLong();
                Conta c = cd.buscarPeloNumero(numero);
                if (cd.apagar(c)) {
                    System.out.println("Conta deletada!");
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
    }
}
