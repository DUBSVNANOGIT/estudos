package application;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        ContasRepo repo = new ContasRepo();
        // int numero = Integer.parseInt(sc.nextLine());
        // String titular = sc.nextLine();
        // double saldo = Double.parseDouble(sc.nextLine());
        // Conta conta = new Conta(numero, titular, saldo);
        Conta conta = new Conta(3, "Bob", 40.0);
        System.out.println("Certo até aqui");
        int n = repo.criar(conta);
        //System.out.println(n);
        //List<Conta> contas = repo.lerTodas();
        //for (Conta c : contas) {
        //    System.out.println("# a conta " + c.getNumero() + " pertence a " + c.getTitular() + " e tem R$ " + c.getSaldo());
        //

        Conta c2 = repo.read(2);
        System.out.println("# a conta " + c2.getNumero() + " pertence a " + c2.getTitular() + " e tem R$ " + c2.getSaldo());

        System.out.println(repo.update(conta));
        


    }

    public static void read() {
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.xwwanfrmrvlvwrxynxos&password=zowiebowie1*";
        try {
            Connection c = DriverManager.getConnection(url);
            String sql = "SELECT * FROM contas";
            PreparedStatement statement = c.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println("N°: " + rs.getString("nro_conta") + ", Saldo: " + rs.getString("saldo"));
            }
            c.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void read(int n) {
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.xwwanfrmrvlvwrxynxos&password=zowiebowie1*";
        String nconta = String.valueOf(n);
        try {
            Connection c = DriverManager.getConnection(url);
            PreparedStatement stmt = c.prepareStatement("SELECT * WHERE nro_conta = " + nconta);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("N°: " + rs.getString("nro_conta") + ", Saldo: " + rs.getString("saldo"));
            }
            c.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
