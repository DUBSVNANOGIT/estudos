import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        int in = 0;
        int out = 0;
        for (int i = 0; i < N; i++) {
            int x = entrada.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else  {
                out++;
            }
        }
        System.out.println("in " + in);
        System.out.println("out " + out);
        entrada.close();
    }
}
