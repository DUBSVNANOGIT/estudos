package jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.xwwanfrmrvlvwrxynxos&password=zowiebowie1*";
        Connection c = DriverManager.getConnection(url);
        System.out.println("Conexão bem-sucedidada");
        String sql = "SELECT * FROM contas";
        PreparedStatement stm = c.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getLong("nro_conta") + " - ");
            System.out.println(rs.getDouble("saldo"));
        }

        
    }
}
