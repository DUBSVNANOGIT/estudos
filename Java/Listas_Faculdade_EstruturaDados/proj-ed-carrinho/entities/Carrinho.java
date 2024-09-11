package entities;

import java.util.List;

public class Carrinho {
    private List<ItemCompra> listaItens;
    private double totalCompra;
    private double porcDesconto;
    private double valorPagar;

    public Carrinho(List<ItemCompra> listaItens, double porcDesconto) {
        this.listaItens = listaItens;
        this.totalCompra = 0;
        this.porcDesconto = porcDesconto;
        this.valorPagar = 0;
    }

    public void mostraCarrinho() {
        for (int i = 0; i < this.listaItens.size(); i++) {
            System.out.println((i + 1) + " " + this.listaItens.get(i).mostraItem());
        }
        System.out.printf("\nSubtotal: R$ %.2f" , somaValores());
        System.out.printf("\nDescontos: R$ %.2f" , calcDesconto());
        valorPagar = totalCompra + calcDesconto();
        System.out.printf("\nTOTAL: R$ %.2f" , valorPagar);
    }

    public double calcDesconto(){
        return - (totalCompra * porcDesconto);
    };

    public double somaValores() {
        for(ItemCompra it : listaItens) {
           this.totalCompra += it.calcSubtotal();
        }
        return totalCompra;
    }
}
