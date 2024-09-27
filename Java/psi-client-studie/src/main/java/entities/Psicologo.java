package entities;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Psicologo {
    private String nome;
    private long crp;
    private String cpf;
    private BigDecimal valor_consulta;

    public Psicologo(String nome, long crp, String cpf, BigDecimal valor_consulta) {
        this.nome = nome;
        this.crp = crp;
        this.cpf = cpf;
        this.valor_consulta = valor_consulta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCrp() {
        return crp;
    }

    public String getCpf() {
        return cpf;
    }

    public BigDecimal getValor_consulta() {
        return valor_consulta;
    }

    public void setValor_consulta(BigDecimal valor_consulta) {
        this.valor_consulta = valor_consulta;
    }
}
