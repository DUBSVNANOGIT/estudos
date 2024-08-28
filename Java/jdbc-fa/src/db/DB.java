package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
    private static Connection conn = null;

    public Connection getConnection()  {
        if (conn == null) {
            try {
                Properties props;
                try (FileInputStream fs = new FileInputStream("C:\\Users\\Duqo\\Desktop\\Estudo\\Java\\jdbc-fa\\db.properties")) {
                    props = new Properties();
                    props.load(fs);
                } catch (IOException e) {
                    throw new DbException(e.getMessage());
                }
                String url = props.getProperty("dburl");
                conn = DriverManager.getConnection(url, props);

            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        System.out.println("Conectado ao Banco de Dados");
        return conn;
    }
}
