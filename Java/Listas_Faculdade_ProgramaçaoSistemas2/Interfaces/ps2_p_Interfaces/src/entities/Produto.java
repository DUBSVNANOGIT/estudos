package entities;

import java.util.Date;

public class Produto implements ItemVendavel, ItemPerecível {

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + "]";
	}

	private String nome;
	private double preco;
	private boolean perecivel;
	private boolean vendavel;
	private Date venc;
	
	
	public Produto(String nome, double preco, boolean perecivel, boolean vendavel, Date venc) {
		this.nome = nome;
		this.preco = preco;
		this.perecivel = perecivel;
		this.vendavel = vendavel;
		this.venc = venc;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public boolean isVendavel() {
		if (venceu() && vendavel) 
			return true;
		else 
			return false;
	}

	@Override
	public void vender(ItemEstoque item, int qtd) {
		if (isVendavel() && item.getQtde() >= qtd)
			item.setQtde(item.getQtde() - qtd);
	}


	@Override
	public boolean venceu() {
		Date aux = new Date();
		if (venc.after(aux)) 
			return true;
		else
			return false;
	}

	@Override
	public boolean isPerecivel() {
		return this.perecivel;
	}
	
	
	
}
