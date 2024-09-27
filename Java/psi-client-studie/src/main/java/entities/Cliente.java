package entities;

import java.util.Random;

public class Conta {
    private long cpf;
    private String nome;
    private String rg;

    public Conta(String nome, String rg) {
        this.cpf = gerarCpfAleatorio();
        this.nome = nome;
        this.rg = rg;
    }

    public long getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public long gerarCpfAleatorio() {
        int[] cpf = {0,1,2,3,4,5,6,7,8};
        int v1 = 0, v2 = 0;
        for (int i = 0; i < cpf.length - 1; i++) {
            v1 = v1 + cpf[i] * (9 - (i % 10));
            v2 = v2 + cpf[i] * (9 - (i + 1) % 10);
        }
        v1 = (v1 % 11) % 10;
        v2 = v2 + v1 * 9;
        v2 = (v2 % 11) % 10;
        return v2;
    }
}
