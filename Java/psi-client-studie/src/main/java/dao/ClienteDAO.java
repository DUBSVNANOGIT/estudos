package dao;

import entities.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteDAO extends DAO<Cliente>{
    private PreparedStatement pstmCREATE;
    private PreparedStatement pstmREADALL;
    private PreparedStatement pstmREADBYID;
    private PreparedStatement pstmUPDATE;
    private PreparedStatement pstmDELETE;

    public ClienteDAO(Connection c) {
        try {
            this.pstmCREATE = c.prepareStatement("INSERT INTO cliente VALUES (?,?,?)");
            this.pstmREADALL = c.prepareStatement("SELECT * FROM cliente");
            this.pstmREADBYID = c.prepareStatement("SELECT * WHERE cpf = (?)");
            this.pstmUPDATE = c.prepareStatement("UPDATE cliente SET nome = (?) WHERE cpf = (?)");
            this.pstmDELETE = c.prepareStatement("DELETE * WHERE cpf = (?)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public Cliente readById(long id) {
        try {
            pstmREADBYID.setLong(1, id);
            ResultSet rs = pstmREADBYID.executeQuery();
            return new Cliente(rs.getString("nome"), rs.getString("rg"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Cliente> readAll() {
        List <Cliente> clientes = new ArrayList<>();
        try {
            ResultSet rs = pstmREADALL.executeQuery();
            while (rs.next()) {
                clientes.add(new Cliente(rs.getString("nome"), rs.getString("rg")));
            }
            return clientes;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return clientes;
    }

    @Override
    public boolean create(Cliente User) {
        try {
            pstmCREATE.setLong(1, User.getCpf());
            pstmCREATE.setString(2, User.getNome());
            pstmCREATE.setString(3, User.getRg());
            return (pstmCREATE.executeUpdate() > 0);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(Cliente User) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a retificação do nome :");
        String nome = sc.nextLine();
        try {
            pstmUPDATE.setString(1, nome);
            pstmUPDATE.setLong(1, User.getCpf());
            return (pstmUPDATE.executeUpdate() > 0);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(long id) {
        try {
            pstmDELETE.setLong(1, id);
            return (pstmDELETE.executeUpdate() > 0);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
