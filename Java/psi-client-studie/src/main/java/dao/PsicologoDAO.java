package dao;

import entities.Psicologo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PsicologoDAO extends DAO<Psicologo> {
    private PreparedStatement pstmCREATE;
    private PreparedStatement pstmREADALL;
    private PreparedStatement pstmREADBYID;
    private PreparedStatement pstmUPDATE;
    private PreparedStatement pstmDELETE;

    public PsicologoDAO(Connection c ) {
        try {
            this.pstmCREATE = c.prepareStatement("INSERT INTO psicologo VALUES (?,?,?,?)");
            this.pstmREADALL = c.prepareStatement("SELECT * FROM psicologo");
            this.pstmREADBYID = c.prepareStatement("SELECT * WHERE crp = (?)");
            this.pstmUPDATE = c.prepareStatement("UPDATE psicologo SET valor_consulta = (?) WHERE crp = (?)");
            this.pstmDELETE = c.prepareStatement("DELETE * WHERE crp = (?)");
        } catch (SQLException e ) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Psicologo readById(long id) {
        try {
            pstmREADBYID.setLong(1, id);
            ResultSet rs = pstmREADBYID.executeQuery();
            return new Psicologo(rs.getString("nome"),
                    rs.getLong("crp"),
                    rs.getString("cpf"),
                    rs.getBigDecimal("valor_consulta"));
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Psicologo> readAll() {
        List<Psicologo> psicologos = new ArrayList<>();
        try {
            ResultSet rs = pstmREADALL.executeQuery();
            while (rs.next()) {
                psicologos.add(new Psicologo(rs.getString("nome"),
                        rs.getLong("crp"),
                        rs.getString("cpf"),
                        rs.getBigDecimal("valor_consulta")));
            }
            return psicologos;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return psicologos;
    }

    @Override
    public boolean create(Psicologo User) {
        try {
            pstmCREATE.setLong(1, User.getCrp());
            pstmCREATE.setString(2, User.getNome());
            pstmCREATE.setString(3, User.getCpf());
            pstmCREATE.setBigDecimal(4, User.getValor_consulta());
            return (pstmCREATE.executeUpdate() > 0);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(Psicologo User) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um o novo saldo: ");
        BigDecimal saldo = sc.nextBigDecimal();
        try {
            pstmUPDATE.setLong(1,User.getCrp());
            pstmUPDATE.setBigDecimal(2, saldo);
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
