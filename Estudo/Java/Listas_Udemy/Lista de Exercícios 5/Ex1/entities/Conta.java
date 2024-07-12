package entities;

public class Conta {
    private int numConta; //get
    private String nome; //get set
    private double saldo; //get

    public Conta(int numConta, String nome, double saldo) {
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
    }
    public Conta(int numConta, String nome) {
        this.numConta = numConta;
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor - 5;
    }

    @Override
    public String toString() {
        return "Conta " + getNumConta() + ", Nome: " + getNome() + ", Saldo: " + getSaldo();
    }
}