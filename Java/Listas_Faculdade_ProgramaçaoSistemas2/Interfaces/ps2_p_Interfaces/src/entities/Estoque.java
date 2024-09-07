package entities;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class Estoque {
	private List <ItemEstoque> itensEstoque;
	
	public Estoque() {
		this.itensEstoque = new ArrayList<>();
	}

	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("BEM VINDO AO GERENCIADOR DE ESTOQUE");
		System.out.println("OPÇÕES: ");
		System.out.println("1. Adicionar produto ao estoque");
		System.out.println("2. Remover produtos vencidos");
		System.out.println("3. Realizar venda");
		System.out.println("4. Imprimir produtos");
		System.out.println("5. Sair");
		System.out.print("Opção: ");
		int op = sc.nextInt();
		while (op != -1) {
			System.out.println("BEM VINDO AO GERENCIADOR DE ESTOQUE");
			System.out.println("OPÇÕES: ");
			System.out.println("1. Adicionar produto ao estoque");
			System.out.println("2. Remover produtos vencidos");
			System.out.println("3. Realizar venda");
			System.out.println("4. Imprimir produtos");
			System.out.println("5. Sair");
			System.out.print("Opção: ");
			op = sc.nextInt();
			if (op == 1) {
				adicionaProduto();
			}
			else if (op == 2) {
				removePer();
			}
			else if (op == 3) {
				realizarVenda();
			}
			else if (op == 4) {
				imprime();
			}
			else if ( op == 5) {
				break;
			}
		}
	}

	public void removePer() {
		System.out.println("Os seguintes itens estão vencidos, esta operação irá remove-los do estoque!");
		for(int i = 0; i < itensEstoque.size(); i++) {
			if (itensEstoque.get(i).getProduto().venceu()) {
				itensEstoque.remove(i);
			}
		}
		imprime();
	}
	
	public void adicionaProduto() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.println("Perecível? 1 - Sim, 2 - Não");
		int aux = sc.nextInt();
		boolean per = (aux == 1)? true : false;
		System.out.println("Vendavel? 1 - Sim, Outro valor - Não");
		boolean vendavel = (aux == 1)? true : false;
		System.out.print("Quantidade: ");
		int qtde = sc.nextInt();
		if (per) {
			System.out.print("Ano: ");
			int ano = sc.nextInt();
			System.out.print("Mês: ");
			int mes = sc.nextInt();
			System.out.print("Dia: ");
			int dia = sc.nextInt();
			itensEstoque.add(new ItemEstoque(new Produto(nome, preco, per, vendavel, new GregorianCalendar(ano, mes, dia).getTime()), qtde));
		}
		else {
			itensEstoque.add(new ItemEstoque(new Produto(nome, preco, per, vendavel, new GregorianCalendar(2024, 9, 11).getTime()), qtde));
		}
		
		System.out.println("Produto Adicionado!");
	}
	public void adicionaItem(ItemEstoque item) {
		itensEstoque.add(item);
	}
	
	public List<ItemEstoque> getItensEstoque() {
		return this.itensEstoque;
	}
	
	public List<Produto> getItensPereciveis() {
		List<Produto> aux = new ArrayList<>();
		for (int i = 0; i < this.itensEstoque.size(); i ++) {
			if(this.itensEstoque.get(i).getProduto().isPerecivel()) {
				aux.add(this.itensEstoque.get(i).getProduto());
			}
		}
		return aux;
	}




	public void realizarVenda() {
		imprime();
		Scanner sc = new Scanner(System.in);
		System.out.print("N° do Produto: ");
		int aux = sc.nextInt();
		System.out.print("Quantidade: ");
		int qtde = sc.nextInt();
		this.itensEstoque.get(aux - 1).getProduto().vender(this.itensEstoque.get(aux - 1), qtde);
	}


	
	public void imprime() {
		System.out.println("Lista de Produtos disponíveis para venda.");
		for (int i = 0; i < this.itensEstoque.size(); i ++) {
			if (itensEstoque.get(i).getProduto().isVendavel()) {
			ItemEstoque aux1 = this.itensEstoque.get(i);
			System.out.println((i + 1) + ". " + aux1.getProduto().getNome() + " Valor: " + aux1.getProduto().getPreco() + " Quantidade: " + aux1.getQtde());			
			}
		}
	}

}
