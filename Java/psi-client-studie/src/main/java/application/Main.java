package application;

import dao.ClienteDAO;
import dao.PsicologoDAO;
import entities.Cliente;
import entities.ConnectionFactory;
import entities.Psicologo;

import java.math.BigDecimal;
import java.sql.Connection;

public class Main {
    static Connection c = new ConnectionFactory().getConnection();

    public static void main(String[] args) {
        Psicologo ps2 = new Psicologo("PAULO", 5555555, "XXXXXXXXXXX", new BigDecimal(200));
        Cliente c1 = new Cliente("Jairo", "909090909090-0");
        PsicologoDAO pd = new PsicologoDAO(c);
        ClienteDAO cd = new ClienteDAO(c);
        cd.create(c1);
        pd.create(ps2);
    }
}