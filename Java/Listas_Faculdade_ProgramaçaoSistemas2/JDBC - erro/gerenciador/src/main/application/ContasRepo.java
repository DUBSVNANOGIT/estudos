package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
