import java.util.*;

public class Program  {
	public static void main(String[] args) {
		Random r = new Random();
		//a lista começa em 1;
		//verificar por que o nodo não esta sendo inserido corretamente no K;
		int[] LL = new int[10];
		int IA = 1, FA = 10, IL = 2, FL = 5;
		int K = 3;
		int Ind = 0;
		int InfoNodo = 999; 

		for (int i = IL; i < FL; i++) {
			LL [i] = r.nextInt(10);
		}

		inserirFimLLArr(LL, IA, FA, IL, FL, InfoNodo, Ind);
		inserirLLArrPosK(LL, IA, FA, IL, FL, InfoNodo, Ind,K);

		
	}
		
		static void inicializarLLArr(int IA, int IL, int FL) {
			IA = IA -1;
			FL = IA;
			IL = FL;
		}

		static void inserirIniLLArr(int[] LL, int IA, int FA, int IL, int FL, int InfoNodo, int Ind) {
			boolean sucesso;
			//verifica se há espaço lógico na lista 
			if (( IA == IL) && (FA == FL)) {
				sucesso = false; 
			} 
			else {
				//verifica se a lista está vazia. Se sim, os espaços FL são atualizados para o valor do início do Arranjo;
				if (IL == 0) {
					FL = IA;
					IL = FL;
				}
				else {
					//IL verifica se é maior que IA, sendo assim confirma o espaço acima
					if (IL > IA) {
						// O IL é reduzido em 1, habilitando 1 espaço para inserção
						IL = IL - 1;
					}
					else {
						// DESLOCAR NODOS PARA CIMA
						for (Ind = FL; Ind >= IL; Ind--) {
							LL[Ind + 1] = LL [Ind];
						}
						// final da lista aumenta
						FL = FL + 1;
					}
				}
				LL[IL] = InfoNodo;
			for (int i : LL) {
			System.out.print(i + " ");
			}
			System.out.println();
			sucesso = true;

			}
		}

		static void inserirFimLLArr(int[] LL, int IA, int FA, int IL, int FL, int InfoNodo, int Ind) {
			boolean sucesso = false;
			if ((IA == IL) && (FA == FL)) {
				sucesso = false;
			}
			else {
				if (IL == 0) {
					FL = IA;
					IL = FL;
				}
				else {
					if (FL < FA) {
						FL = FL + 1;
					}
					else {
						for (Ind = IL; Ind <= FL; Ind++) {
							LL[Ind + 1] = LL[Ind];
						}
						IL = IL - 1;
					}
				}
			}
			
			LL[FL] = InfoNodo;
			for (int i : LL) {
			System.out.print(i + " ");
			}
			System.out.println();
			sucesso = true;
		}

		static void inserirLLArrPosK(int[] LL, int IA, int FA, int IL, int FL, int K, int InfoNodo, int Ind){
			boolean sucesso;
			if (((IA == IL) && (FA == FL)) || (K > (FL - IL + 2)) || (K <= 0) || (IL == 0 && K != 1)) {
				sucesso = false;
			}
			else {
				if (IL == 0) {
					FL = IA;
					IL = FL;
				}
				else {
					if (FL != FA) {
						for (Ind = FL; Ind < (IL+K-1); Ind--) {
							LL[Ind+1] = LL[Ind];
						}
						FL = FL + 1;
					}
					else {
						for (Ind = IL; Ind < (IL+K-1);Ind++) {
							LL[Ind-1] = LL[Ind];
						}
						IL = IL - 1;
					}
				}
			LL[IL+K-1] = InfoNodo;
			sucesso = true;

		}
			for (int i : LL) {
			System.out.print(i + " ");
			}
			System.out.println();
	}

}

