import java.util.Random;

public class Program {
    public static void main (String[] args){
        //O(n³)
        int[][] A = new int [800][800];
        int[][] B = new int [800][800];
        int count = 0;
        //preenche as matrizes A e B com números aleatórios
         preencheA(A);
         preencheB(B);
         //cria a matriz C para receber o resultado
         int[][] C = new int [A.length][B[0].length];
        C = multiplica (A,B,count);
        exibeResult(C);
        }

        public static void preencheA(int A[][]){
            Random random = new Random();
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[0].length; j++) {
                    A[i][j] = random.nextInt(10);
                }
            }
        }

        public static void preencheB(int B[][]){
            Random random =  new Random();
            for(int i = 0; i < B.length; i++) {
                for(int j =0; j < B[0].length; j++) {
                    B[i][j] = random.nextInt(10);
                }
            }
        }

        public static int[][] multiplica (int[][]A, int[][]B, int count) {
            int[][] C = new int [A.length] [B[0].length];
            for (int i=0; i < A.length; i++) {
                for(int j=0; j < B[0].length; j++) {
                    C[i][j] = 0;
                    for (int k = 0; k < A[0].length; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                        count += 1;
                    }
                }
            }
            System.out.println("Contador: " + count);
            return C;
        }

        public static void exibeResult(int C[][]){
            for (int i = 0; i < C.length; i++) {
                for (int j = 0; j < C[0].length; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            } 
        }

}
