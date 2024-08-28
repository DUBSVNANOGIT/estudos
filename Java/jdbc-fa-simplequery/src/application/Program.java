package application;

import db.DbException;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
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
                    e.printStackTrace();
                    throw new DbException(e.getMessage());
                }
            }
            System.out.println("Conectado ao Banco de Dados");

            String query = "select nome, idade from pessoa";
            // The following statement is a try-with-resources statement, which declares one resource, stmt, that will be automatically closed when the try block terminates:
            //    try (Statement stmt = con.createStatement()) {
            //      // ...
            //    }
            try (Statement stmt = conn.createStatement()) {
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    String name = rs.getString("nome");
                    int idade = rs.getInt("idade");
                    System.out.println("Nome: " + name + " , " + "Idade: " + idade);
                }
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
}
