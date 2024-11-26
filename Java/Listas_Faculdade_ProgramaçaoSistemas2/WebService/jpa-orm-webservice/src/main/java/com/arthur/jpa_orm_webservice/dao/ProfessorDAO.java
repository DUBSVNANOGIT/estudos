package com.arthur.jpa_orm_webservice.dao;

import java.sql.*;
import java.util.*;

import com.arthur.jpa_orm_webservice.entities.Professor;

public class ProfessorDAO {
    private Connection conn;
    public ProfessorDAO() throws Exception {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543";
        String user = "xwwanfrmrvlvwrxynxos";
        String password = "zowiebowie1*";
        this.conn = DriverManager.getConnection(url,user,password);
    }

    public Professor create(Professor professor) throws Exception {
        PreparedStatement pstm = conn.prepareStatement("insert into professores values (?,?,?,?)");
        pstm.setLong(1, professor.getId());
        pstm.setString(2, professor.getNome());
        pstm.setInt(3,professor.getMatricula());
        pstm.setString(4, professor.getArea());
        int cont = pstm.executeUpdate();
        System.out.println("Foram inseridas " + cont + " linhas");
        return professor;
    }

    public List<Professor> listarProfessores() throws Exception {
        List<Professor> professores = new ArrayList<>();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("select * from professores");
        while (rs.next()) {
            Professor aux = new Professor();
            aux.setId(rs.getLong("id"));
            aux.setNome(rs.getString("nome"));
            aux.setMatricula(rs.getInt("matricula"));
            aux.setArea(rs.getString("area"));
            professores.add(aux);
        }
        return professores;
    }

    public Professor buscarPorId(long id) throws Exception {
        List<Professor> professores = listarProfessores();
        for(int i = 0; i < professores.size(); i ++) {
            if (professores.get(i).getId() == id ) {
                return professores.get(i);
            }
        }
        return null;
    }

    public void deleteById(long id) throws Exception {
        PreparedStatement pstm = conn.prepareStatement("DELETE * frOM PROFESSORES WHERE id = ?");
        pstm.setLong(1, id);
        pstm.executeUpdate();
    }
}
