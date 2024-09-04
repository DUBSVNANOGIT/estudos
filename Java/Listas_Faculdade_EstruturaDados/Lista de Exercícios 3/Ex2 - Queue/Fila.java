public class Fila {
    private int[] f;
    private int inicio;
    private int fim;
    private int qtdElementos;

    public Fila(int tam) {
        f = new int[tam];
        inicio = 0;
        fim = -1;
        qtdElementos = 0;
    }

    public boolean filaCheia() {
        if (qtdElementos == f.length) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean filaVazia() {
        if (qtdElementos == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean inserir(int elemento) {
        if (filaCheia()) {
            return false;
        }
        else {
            fim = ((fim + 1) % f.length);
            f[fim] = elemento;
            qtdElementos++;
        }
        return true;
    }

    public int remover() {
        int valor;
        if (filaVazia()) {
            return -1; //retorna código de erro
        }
        else {
            valor = f[inicio];
            inicio = ((inicio + 1) % f.length);
            qtdElementos--;
            //return (f[inicio])
            return valor;
        }
    }

    public int exibirInicio() {
        if (filaVazia()) {
            return -1;
        }
        else {
            System.out.println(f[inicio]);
            return f[inicio];
        }
    }

    public void exibirElementos() {
        int ini, qtd;
        ini = inicio;
        qtd = qtdElementos;

        if (filaVazia()) {
                System.out.println("Fila Vazia");
        }
        else {
            while (qtd-- != 0) {
               ini = ((ini + 1) % f.length);
               System.out.print(f[ini] + " ");
            }
        }
    }
}
