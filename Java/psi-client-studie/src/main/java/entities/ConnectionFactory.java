package entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.xwwanfrmrvlvwrxynxos&password=zowiebowie1*";
    public ConnectionFactory(){};

    public Connection getConnection() {
        Connection c;
        try {
            c = DriverManager.getConnection(url);
            System.out.println("Conexão feita");
            return c;
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
