package application;

public class Pilha {
    private int topo;
    private char[] dados;

    public Pilha(int tam) {
        topo = -1;
        dados = new char[tam];
    }

    public boolean empty() {
        return (topo == -1);
    }

    public boolean cheia() {
        return (topo == dados.length - 1);
    }

    public void push(char c) {
        dados[topo + 1] = c;
        // dados[==topo] = c
    }

    public char pop() {
        return dados[topo - 1];
        //dados[topo--]
    }

    public int size() {
        return topo + 1;
    }

    public int topoP() {
        return dados[topo];
    }
}
