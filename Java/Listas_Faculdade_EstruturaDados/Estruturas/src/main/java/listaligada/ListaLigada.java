package listaligada;

public class ListaLigada <E> {
    No inicio;
    No fim;
    int tamanho;

   public ListaLigada () {
       this.inicio = null;
       this.fim = null;
       this.tamanho = 0;
   };

   public boolean vazia() {
       if (tamanho == 0)
           return true;
       else
           return false;
   }

   //metodo para inserir no inicio
    public void inserirNoInicio(No n) {
       if (vazia()) {
           this.inicio = n;
           this.fim = inicio;
       }
       else {

       }
       tamanho++;
    }

    public void exibirLista() {
       if (vazia())
           System.out.println("Lista vazia");
       else {
           inicio.mostrar();
           No aux = null;
           while (inicio.proximo != null) {
               aux.proximo = inicio;
               inicio.proximo = aux;





               inicio.mostrar();
               inicio = inicio.proximo;
           }
       }
    }

    //metodo para inserir no final




}
