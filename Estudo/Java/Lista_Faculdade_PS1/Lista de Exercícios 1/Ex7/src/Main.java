import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();
        System.out.println("a soma dos quadrados dos três números");
        System.out.println(Math.pow(n1, 2) + Math.pow(n2,2) + Math.pow(n3,2));
        System.out.println("o quadrado da soma dos três números.");
        System.out.println(Math.pow((n1+n2+n3),2));
    }
}