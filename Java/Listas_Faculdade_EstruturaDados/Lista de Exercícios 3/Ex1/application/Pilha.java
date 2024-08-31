package application;

public class Pilha {
    private int[] p;
    private int topo = -1;

    public Pilha() {}
    public Pilha(int tam) {
        p = new int[tam];
    }

    public boolean empilhar(int valor) {
        if (topo == p.length) {
            return false;
        }
        p[topo] = valor;
        return true;
    }

    public int desempilhar() {
        if (topo <= 0) {
            pilhaVazia();
        }
        return topo = topo - 1;
    }

    public int mostrarTopo(){
        return p[topo];
    }

    public boolean pilhaVazia() {
        if (topo < 0) {
            System.out.println("Pilha vazia");
            return true;
        }
        System.out.println("Pilha contém valores.");
        return false;
    }

    public boolean pilhaCheia() {
        if (topo == p.length - 1) {
            System.out.println("A pilha está cheia");
            return true;
        }
        System.out.println("Pilha ainda não está cheia.");
        return false;
    }
}
