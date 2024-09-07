package application;

public class Program {
    public static void main(String[] args) {

        Pilha pilha = new Pilha (5);
        pilha.empilhar(10);
        System.out.println(pilha.mostrarTopo());
        pilha.empilhar(2);
        pilha.empilhar(3);
        pilha.empilhar(9);
        pilha.empilhar(1);
        pilha.empilhar(3);
        System.out.println(pilha.mostrarTopo());
        pilha.empilhar(11);
        pilha.desempilhar();
        pilha.empilhar(11);
        pilha.pilhaCheia();
    }
}
