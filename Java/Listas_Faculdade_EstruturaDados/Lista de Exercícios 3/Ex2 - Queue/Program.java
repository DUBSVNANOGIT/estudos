public class Program {
    public static void main(String[] args) {

        Fila fila = new Fila(6 );
        fila.inserir(5);
        fila.inserir(20);
        fila.inserir(3);
        fila.inserir(10);
        fila.inserir(8);
        fila.inserir(7);
        fila.exibirElementos();
        fila.exibirInicio();
        fila.remover();
        fila.exibirElementos();
    }
}
