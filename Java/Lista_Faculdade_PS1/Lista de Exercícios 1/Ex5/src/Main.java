import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inteiro = entrada.nextInt();
        char caracter = entrada.next().charAt(0);
        double pontoF = entrada.nextDouble();
        String dia = entrada.next();
        System.out.printf("Hoje é %s, Faz %de minutos que comecei a aprender Java %c já entendi quase %.2f porcento de tudo que foi discutido até aqui",  dia, inteiro, caracter, pontoF);
        entrada.close();
    }
}