import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A =  entrada.nextInt();
        int B =  entrada.nextInt();

        if (A % B == 0 ) {
            System.out.print("São Multiplos");
        } else if (B % A == 0) {
            System.out.print("São Multiplos");
        }else {
            System.out.print("Não são Multiplos");
        }
    }
}