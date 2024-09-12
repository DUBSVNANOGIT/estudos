package jdbc;

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
            String titular = rs.getDouble("saldo");
            
        }
    }

}
