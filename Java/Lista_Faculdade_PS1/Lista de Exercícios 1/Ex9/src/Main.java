import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorProduto = entrada.nextDouble();
        double pagamentoCliente = entrada.nextDouble();

        double troco = pagamentoCliente - valorProduto;

        // cédulas
        int duzentos;
        int cem;

        public static double calcTroco() {
        if (troco % 200 == 0) {
            duzentos += 1;
        } else if (troco % 100 == 0) {
            cem += 1;
        }
        return duzentos;
        }




        //pausa para estudar para a entrevistra de estágio
    }
}