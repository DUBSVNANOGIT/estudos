import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int x = entrada.nextInt();

        for (int i = 0; i < x+1; i++) {
            if ( i % 2 != 0) {
                System.out.println(i);
            }
        }

        entrada.close();
    }
}