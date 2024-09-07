package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
	private List <ItemEstoque> itensEstoque;
	
	public Estoque() {
		this.itensEstoque = new ArrayList<>();
	}
	
	public void adicionaProduto(Produto p, int qtde) {
		this.adicionaItem(new ItemEstoque(p, qtde));
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
		System.out.println("Lista de Produtos disponíveis para venda.");
		for (int i = 0; i < itensEstoque.size(); i++) {
			if (itensEstoque.get(i).getProduto().isVendavel()) {
			System.out.println((i + 1) + ". " + itensEstoque.get(i).getProduto().getNome() + " Valor: " + itensEstoque.get(i).getProduto().getPreco() + " Quantidade: " + itensEstoque.get(i).getQtde());
			};
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("N° do Produto: ");
		int aux = sc.nextInt();
		System.out.print("Quantidade: ");
		int qtde = sc.nextInt();
		this.itensEstoque.get(aux - 1).getProduto().vender(this.itensEstoque.get(aux - 1), qtde);
		for (int i = 0; i < itensEstoque.size(); i++) {
			if (itensEstoque.get(i).getProduto().isVendavel()) {
			System.out.println((i + 1) + ". " + itensEstoque.get(i).getProduto().getNome() + " Valor: " + itensEstoque.get(i).getProduto().getPreco() + " Quantidade: " + itensEstoque.get(i).getQtde());
			};
		}
		for (ItemEstoque item : itensEstoque) {
			System.out.println(item.getQtde());
		}
	}
	
	public void imprime() {
		for (int i = 0; i < this.itensEstoque.size(); i ++) {
			ItemEstoque aux1 = this.itensEstoque.get(i);
			System.out.println(aux1.getProduto().getNome() + " - " + aux1.getQtde());
			
		}
	}

}
