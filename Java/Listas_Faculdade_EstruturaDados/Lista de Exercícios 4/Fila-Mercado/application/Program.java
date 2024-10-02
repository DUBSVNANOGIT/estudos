import java.util.*;

public class Program {
	public static void main(String[] args) {
		Random r = new Random();
		int duracao = 480;
		int tClientesAtendidos = 0;
		int tempoMedioEspera = 0, tempoEsperaTotal = 0;
		int maiorTempoFila = 0;
		Fila f = new Fila(duracao * 2);
		
		for (int min = 0; min < duracao; min++) {
			if (!f.vazia()) {
				maiorTempoFila = f.topo();
				f.remover();
				tClientesAtendidos++;
				tempoEsperaTotal += min;
			}

			int k = r.nextInt(3);
			for (int i = 0; i < k; i++) {
				f.inserir(min);
			}


		}
		tempoMedioEspera = tempoEsperaTotal / tClientesAtendidos;
		System.out.println("Tempo " + duracao);
		System.out.println("N° t. de clientes atendidos: " + tClientesAtendidos); 
		System.out.println("T. médio de Espera: " + tempoMedioEspera);
		System.out.println("Maior t. de Espera: " + maiorTempoFila);

	} 
	static class Fila {
		int[] vetor;
		int tamanho, primeiro, ultimo, MAX;

		public Fila(int val)  {
			MAX = val;
			vetor = new int [MAX];
			primeiro = 0;
			ultimo = -1;
			tamanho = 0;
		}

		boolean vazia() {
			if (tamanho == 0) 
				return true;
			else 
				return false;
		}

		boolean cheia() {
			if (tamanho == MAX) 
				return true;
			else 
				return false;
		}

		boolean inserir(int n) {
			if (!cheia()) {
				ultimo = (ultimo + 1) % MAX;
				vetor[ultimo] = n;
				tamanho = tamanho + 1;
				return true;
			}
			else {
				System.out.println("Fila cheia");
				return false;
			}
		}

		boolean remover() {
			if (!vazia()) {
				primeiro = (primeiro + 1) % MAX;
				tamanho = tamanho - 1;
				return true;
			}
			else {
				System.out.println("Fila vazia");
				return false;
			}
		}

		int topo(){
			return vetor[primeiro];
		}

		void exibirFila() {
			for (int i = 0; i < tamanho; i++) {
				System.out.println(vetor[i] + " ");
			}
		}
	}
}
