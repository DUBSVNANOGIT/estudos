import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double espetaculo = entrada.nextDouble();
        double ingresso = entrada.nextDouble();

        double ingressosNecessarios = espetaculo/ingresso;
        double IngressosLucro23 = (espetaculo * 1.23)/ingresso;

        System.out.printf("Para pagar espetáculo de %.2f será necessária a venda de %.0f ingressos, cada um deles custando %.2f", espetaculo, ingressosNecessarios, ingresso);
        System.out.printf("\nPara obter um lucro de 23 porcento será necessário a venda de %.0f ingressos", IngressosLucro23);
    }
}