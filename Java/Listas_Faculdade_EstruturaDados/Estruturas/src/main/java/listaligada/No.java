package listaligada;

public class No <E> {
    E elemento;
    No proximo;
    No anterior;

    public No (E elemento) {
        this.elemento = elemento;
        this.proximo = null;
        this.anterior = null;
    }

    void mostrar() {
        System.out.println(this.elemento);
    }

}
