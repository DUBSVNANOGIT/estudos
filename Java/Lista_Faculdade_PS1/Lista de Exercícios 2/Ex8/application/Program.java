package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qualquer valor diferente de -1 para iniciar;");
        int opt = sc.nextInt();
        int m = 0, f = 0;
        double altura = 0, maior =0, menor = 0, mediaF = 0, populaçãoM = 0;
        while (opt != -1) {
            System.out.println("Sexo: ");
            opt = sc.nextInt();
            if (opt == 0) {
                m++;
            }
            else if(opt == 1) {
                f++;
            }
            System.out.println("Altura: ");
            altura = sc.nextDouble();
            if (altura > maior) {
                maior = altura;
            }
            if (altura < menor){
                menor = altura;
            }
            if (opt == 1) {
                mediaF += altura;
            }
        }
        mediaF /= f;
        populaçãoM = (m * (m+f)) / 100;

        System.out.printf("\n Total: %d " +
                "\n Homens: %d" +
                "\n Mulheres: %d" +
                "\n Maior altura: %.2f" +
                "\n Menor altura: %.2f" +
                "\n Media altura das Mulheres: %.2f" +
                "\n Porcentagem de Homens: %.2f",
        m+f,m,f,maior,menor,mediaF,populaçãoM);

    }
}
