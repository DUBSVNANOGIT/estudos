package dao;

import gerenciador.Titular;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TitularDao implements ITitularDAO {
    private PreparedStatement pstmCreate;
    private PreparedStatement pstmRead;
    private PreparedStatement pstmReadByNumber;
    private PreparedStatement pstmUpdate;
    private PreparedStatement pstmDelete;

    public TitularDao(String url) {
        try (Connection c = DriverManager.getConnection(url)) {
            this.pstmCreate = c.prepareStatement("INSERT INTO titulares VALUES (?,?,?,?)");
            this.pstmRead = c.prepareStatement("SELECT * FROM titulares");
            this.pstmReadByNumber = c.prepareStatement("SELECT * FROM titulares WHERE nro_titular = (?)");
            this.pstmUpdate = c.prepareStatement("UPDATE titulares SET nome=(?) WHERE nro_titular = (?)");
            this.pstmDelete = c.prepareStatement("DELETE FROM titulares WHERE nro_titular = (?)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Titular> lerTodas() {
        List<Titular> titulares = new ArrayList<>();
        try {
            ResultSet rs = pstmRead.executeQuery();
            while (rs.next()) {
                long nro = rs.getLong("nro_titular");
                String n = rs.getString("nome");
                String r = rs.getString("rg");
                String c = rs.getString("cpf");
                titulares.add(new Titular(nro, n , r, c));
                return titulares;
            }
            } catch(SQLException e){
                e.printStackTrace();
        }
        return titulares;
    }

    @Override
    public Titular readByNumber(long nro) {
        try {
            pstmReadByNumber.setLong(1, nro);
            ResultSet rs = pstmReadByNumber.executeQuery();
            Titular titular = new Titular(rs.getLong("nro_titular"),
                rs.getString("nome"),
                rs.getString("rg"),
                rs.getString("cpf"));
            return titular;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean create(Titular titular) {
        try {
            pstmCreate.setLong(1, titular.getNroTitular());
            pstmCreate.setString(2, titular.getNome());
            pstmCreate.setString(3, titular.getRg());
            pstmCreate.setString(4, titular.getCpf());
            return pstmCreate.executeUpdate() > 0;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updtate(Titular titular) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome desejado: ");
        String nome = sc.nextLine();
        try {
            pstmUpdate.setString(1, nome);
            pstmUpdate.setLong(2, titular.getNroTitular());
            return pstmUpdate.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(long nro) {
        try {
            pstmDelete.setLong(1, nro);
            return pstmDelete.executeUpdate() > 0;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
