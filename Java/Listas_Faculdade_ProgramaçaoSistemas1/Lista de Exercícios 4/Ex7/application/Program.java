package application;


public class Program {
    public static void main(String[] args) {
        double resposta1, resposta2;
        resposta1 = calcExp1(2, 3);
        resposta2 = calcExp2(2, 3);
        System.out.println(resposta1 + " e " + resposta2);
    }

    static double calcExp1(double a, double b) {
        double x;
        x = a * a + 2 * a * b + b * b;
        return x;
    }

    static double calcExp2(double a, double b) {
        double x;
        x = Math.pow(a, 2) + 2 * a * b + Math.pow(b, 2);
        return x;
    }
}