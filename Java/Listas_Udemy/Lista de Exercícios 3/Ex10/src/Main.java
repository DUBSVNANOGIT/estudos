import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        for (int i = 1; i <= N; i++) {
            int x = i;
                System.out.println(x + " " + x*x + " " + x*x*x);
            }
            entrada.close();
        }
    }
