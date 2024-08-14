package application;
import java.util.Random;


public class Program {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[10][8];
        //preencher a raiz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = random.nextInt(6);
            }
        }
        System.out.println("Matriz");
        for (int[] andar : matriz) {
            for (int apartamento : andar) {
                System.out.print(apartamento + " ");
            }
            System.out.println();
        }
        System.out.println("A quantidade de apartamentos vazios (n° moradores = 0)");
        System.out.println(nApVazios(matriz));
        System.out.println("Qual é o andar que tem o maior número de moradores.");
        System.out.println(andarMaiorMoradores(matriz) + "° Andar");
        System.out.println("Quantidade de moradores do prédio: " + qtdeMoradoresPredio(matriz));
    }
    static int nApVazios(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                if (matriz[i][j] == 0) {
                    soma += 1;
                }
            }
        }
        return soma;
    }
    static int andarMaiorMoradores(int[][] matriz) {
        int andarMaior = 0;
        int maior = 0;
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
               if (matriz[i][j] > maior) {
                   maior = matriz[i][j];
                   andarMaior = i+1;
               }
            }
        }
       return andarMaior;
    }
    static int qtdeMoradoresPredio(int[][] matriz) {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                total = total + matriz[i][j];
            }
        }
        return total;
    }

}

