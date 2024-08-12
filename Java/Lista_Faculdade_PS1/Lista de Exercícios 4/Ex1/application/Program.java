package application;

public class Program {
    static int caixaPreta(int a, int b) {
        return a*a + b;
    }
    public static void main(String[] args) {
        int resposta;
        resposta = caixaPreta(3,5);
        System.out.println(resposta);
    }
}
