package dao;

import gerenciador.Conta;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaDao implements IContaDAO {
    PreparedStatement pstmCreate;
    PreparedStatement pstmRead;
    PreparedStatement pstmReadByNumero;
    PreparedStatement pstmUpdate;
    PreparedStatement pstmDelete;

    public ContaDao(String url) {
        try (Connection c = DriverManager.getConnection(url)){
            this.pstmCreate = c.prepareStatement("insert into contas values (?,?)");
            this.pstmRead = c.prepareStatement("select * ");
            this.pstmReadByNumero = c.prepareStatement("select * where numero = (?)");
            this.pstmUpdate = c.prepareStatement(String.format("UPDATE contas SET saldo = (?) WHERE numero = (?)"));
            this.pstmDelete = c.prepareStatement("DELETE FROM contas WHERE numero = (?)");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean criar(Conta conta) {
        try {
            pstmCreate.setLong(1, conta.getNumero());
            pstmCreate.setBigDecimal(2, conta.getSaldo());
            return (pstmCreate.executeUpdate() > 0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Conta> letTodas() {
        List<Conta> contas = new ArrayList<>();
        try {
            ResultSet rs = pstmRead.executeQuery();
            while (rs.next()) {
                long numero = rs.getLong("numero");
                BigDecimal saldo = rs.getBigDecimal("saldo");
                Conta conta = new Conta(numero, saldo);
                contas.add(conta);
            }
            return contas;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contas;
    }

    @Override
    public Conta buscarPeloNumero(long id) {
       List<Conta> contas = letTodas();
       for (Conta c : contas) {
           if (c.getNumero() == id) {
              return c;
           }
       }
        return null;
    }

    @Override
    public boolean atualizar(Conta conta) {
        System.out.println("Digite o novo saldo: ");
        Scanner sc = new Scanner(System.in);
        BigDecimal saldo = sc.nextBigDecimal();
        try {
            pstmUpdate.setLong(1, conta.getNumero());
            pstmUpdate.setBigDecimal(2, saldo);
            conta.setSaldo(saldo);
            return pstmUpdate.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    @Override
    public boolean apagar(Conta conta) {
        try {
            pstmDelete.setLong(1, conta.getNumero());
            return pstmDelete.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
