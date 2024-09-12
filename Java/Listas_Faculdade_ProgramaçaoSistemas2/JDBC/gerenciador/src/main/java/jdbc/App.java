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
        String nconta = String.valueOf(123);
        read();

        
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
        } catch(SQLException e) {
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
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
