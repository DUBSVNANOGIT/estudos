package entities;

import java.util.ArrayList;
import java.util.List;

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
	
	public void vender(Produto p) {

	}
	
	public void imprime() {
		for (int i = 0; i < this.itensEstoque.size(); i ++) {
			ItemEstoque aux1 = this.itensEstoque.get(i);
			System.out.println(aux1.getProduto().getNome() + " - " + aux1.getQtde());
			
		}
	}

}
