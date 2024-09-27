package gerenciador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaDao implements IContaDAO {
    PreparedStatement pstmCreate;
    PreparedStatement pstmRead;
    PreparedStatement pstmReadByNumero;
    PreparedStatement pstmUpdate;
    PreparedStatement pstmDelete;

    public ContaDao(Connection c) {
        try {
            this.pstmCreate = c.prepareStatement("insert into contas values (?,?,?)");
            this.pstmRead = c.prepareStatement("select * ");
            this.pstmReadByNumero = c.prepareStatement("select * where numero = (?)");
            this.pstmUpdate = c.prepareStatement(String.format("UPDATE contas SET saldo = (?) WHERE numero = (?)"));
            this.pstmDelete = c.prepareStatement("DELETE  * WHERE numero = (?)");
            c.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean criar(Conta conta) {
        try {
            pstmCreate.setInt(1, conta.getNumero());
            pstmCreate.setString(2, conta.getTitular());
            pstmCreate.setDouble(3, conta.getSaldo());
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
                int numero = rs.getInt("numero");
                String titular = rs.getString("titular");
                double saldo = rs.getDouble("saldo");
                Conta conta = new Conta(numero, titular, saldo);
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
        double saldo = sc.nextDouble();
        try {
            pstmUpdate.setInt(1, conta.getNumero());
            pstmUpdate.setDouble(2, saldo);
            return pstmUpdate.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    @Override
    public boolean apagar(Conta conta) {
        try {
            pstmDelete.setInt(1, conta.getNumero());
            return pstmDelete.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
