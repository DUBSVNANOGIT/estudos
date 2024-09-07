package application;

import java.util.GregorianCalendar;

import entities.Estoque;
import entities.Produto;

public class Program {

	public static void main(String[] args) {
	
		Produto p1 = new Produto ("Refrigerante", 2.00, false, true, new GregorianCalendar(2024,9,6).getTime());
		Produto p2 = new Produto ("Aveia", 3.00, true, true, new GregorianCalendar(2024,9,6).getTime());
		
		Estoque estoque = new Estoque();
		estoque.adicionaProduto(p1, 10);
		estoque.adicionaProduto(p2, 10);
		p2.toString();
		estoque.realizarVenda();
		p2.toString();
	}

}
