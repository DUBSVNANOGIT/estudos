package gerenciador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContasRepo {
    PreparedStatement stmCreate;
    PreparedStatement stmRead;
    public ContasRepo() throws SQLException {
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.xwwanfrmrvlvwrxynxos&password=zowiebowie1*";
        Connection c = DriverManager.getConnection(url);
        String sqlC = "insert into contas values (?,?,?)";
        stmCreate = c.prepareStatement(sqlC);
        String sqlR = "select * from contas";
        stmRead = c.prepareStatement(sqlR);
        c.close();
    }

    public int delete(int n) {
        try {
            String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.xwwanfrmrvlvwrxynxos&password=zowiebowie1*";
            Connection c = DriverManager.getConnection(url);
            stmCreate = c.prepareStatement("DELETE FROM contas WHERE numero =" + n);
            c.close();
            return stmCreate.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public int update(Conta conta) {
        try {
            String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.xwwanfrmrvlvwrxynxos&password=zowiebowie1*";
            Connection c = DriverManager.getConnection(url);
            Scanner sc = new Scanner(System.in);
            System.out.print("Saldo a ser alterado: ");
            double saldo = sc.nextDouble();
            stmCreate = c.prepareStatement(String.format("UPDATE contas SET saldo = %f WHERE numero = %d", saldo, conta.getNumero()));
            c.close();
            return stmCreate.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public Conta read(int n) throws SQLException {
        int numero;
        String titular;
        double saldo;
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.xwwanfrmrvlvwrxynxos&password=zowiebowie1*";
        Connection c = DriverManager.getConnection(url);
        stmRead = c.prepareStatement(stmRead + " where numero = " + n);
        ResultSet rs = stmRead.executeQuery();
        c.close();
        if (rs.next()) {
            numero = rs.getInt("numero");
            titular = rs.getString("titular");
            saldo = rs.getDouble("saldo");
            Conta conta = new Conta(numero, titular, saldo);
            return conta;
        }
        return null;
    }

    public List<Conta> lerTodas() throws SQLException {
        List<Conta> contas = new ArrayList<>();
        ResultSet rs = stmRead.executeQuery();
        while (rs.next()) {
            int numero = rs.getInt("numero");
            String titular = rs.getString("titular");
            double saldo = rs.getDouble("saldo");
            Conta conta = new Conta(numero, titular, saldo);
            contas.add(conta);
        }
        return contas;
    }

    public int criar(Conta conta) {
        try {
            stmCreate.setInt(1, conta.getNumero());
            stmCreate.setString(2, conta.getTitular());
            stmCreate.setDouble(3, conta.getSaldo());
            return stmCreate.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }

}
