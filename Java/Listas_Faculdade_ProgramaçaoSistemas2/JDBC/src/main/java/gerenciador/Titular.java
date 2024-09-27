package gerenciador;

public class Titular {
    private long nroTitular;
    private String nome;
    private String rg;
    private String cpf;

    public Titular() {}
    public Titular(long nro, String n, String r, String c) {
        this.nroTitular = nro;
        this.nome = n;
        this.rg = r;
        this.cpf = c;
    }

    public long getNroTitular() {
        return nroTitular;
    }

    public void setNroTitular(long nroTitular) {
        this.nroTitular = nroTitular;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
