import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horaInicial = entrada.nextInt();
        int horaFinal = entrada.nextInt();
        int duracao = 0;

        // compara se a hora inicial é menor do que a hora final
        if (horaInicial < horaFinal) {
            //se sim,  ocorre a subtração invertida, para gerar um valor positivo. horaFinal - hora Inicial.
            duracao = horaFinal - horaInicial;
        } else {
            //se não, soma-se a hora inicial com a final e subtrai do total de horas do dia, 24.
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        entrada.close();
    }
}