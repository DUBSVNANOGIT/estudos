package gerenciador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public ConnectionFactory(){};

    public Connection getConnection() {
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.xwwanfrmrvlvwrxynxos&password=zowiebowie1*";
        try {
            Connection c = DriverManager.getConnection(url);
            return c;
        } catch (SQLException e) {
            e.getMessage();
        }
        return null;
    }
}
