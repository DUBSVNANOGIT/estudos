import listaligada.ListaLigada;
import listaligada.No;

public class Main {
    public static void main(String[] args) {
        ListaLigada ll = new ListaLigada();
        ll.inserirNoInicio(new No(10));
        ll.exibirLista();
        ll.inserirNoInicio(new No(20));
        ll.exibirLista();

    }
}
