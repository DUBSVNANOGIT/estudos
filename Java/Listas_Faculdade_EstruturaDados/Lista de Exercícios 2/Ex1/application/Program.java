import java.util.Random;

public class Program {
    public static void main (String[] args){
        int[][] A = new int [2][2];
        int[][] B = new int [2][2];
        int count = 0;
        //preenche as matrizes A e B com números aleatórios
         preencheA(A);
         preencheB(B);
         //cria a matriz C para receber o resultado
         int[][] C = new int [A.length][B[0].length];
        C = multiplica (A,B,count);
        exibeResult(C);
        System.out.println("Contador: " + count)
        }

        public static void preencheA(int A[][], Random random){
            Random random = new Random();
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[0].length; j++) {
                    A[i][j] = random.nextInt(10);
                }
            }
        }
       
        public static void preencheB(int B[][]){
            Random random =  new Random()
            for(int i = 0; i < A.length; i++) {
                for(int j =0; j < B[0].length; j++) {
                    B[i][j] = random.nextInt(10);
                }
            }
        }

        public static int[][] multiplica (int[][]A, int[][]B, int count) {
            int count = 0;
            int[][] C = new int [A.length] [B[0].length];
            for (int i=0; i < A.length; i++)
                for(int j=0; j. B[0].length; j++) {
                    C[i][j] = 0;
                    for (int k = 0; k < A[0].length; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                        count++;
                    }
                }
            }
            return C;
        }

        public static void exibeResult(int C[][]){
            for (int i = 0; i < C.length; i++) {
                for (int j = 0; j < C.length; j++) {
                    System.out.println(C[i][j] + " ");
                }
                System.out.println();
            } 
        }
    
}
