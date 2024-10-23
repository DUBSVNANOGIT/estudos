import java.util.*;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();
        int numTotalClientes = 0;
        int tempoMedioEspera = 0, maiorTempodeEspera = 0;
        Queue<Integer> filaC = new LinkedList<Integer>();
        int n =  30;
        for (int min = 0; min < n; min++){
            int k = random.nextInt(2);
            if (!filaC.isEmpty()) {
                int atendido = filaC.remove();
                if (atendido > maiorTempodeEspera) {
                    maiorTempodeEspera = atendido;
                }
                tempoMedioEspera += min - atendido;
                numTotalClientes++;
            }
            for(int i = 0; i < k; i++) {
                filaC.add(min);
            }   
        }
        System.out.println("Tempo: " + n);
        System.out.println("NumTotalAtendidos: "+  numTotalClientes);
        System.out.println("TempoMedioFla: " + tempoMedioEspera);
        System.out.println("MaiorTempoEspera: " + maiorTempodeEspera);
    }
}