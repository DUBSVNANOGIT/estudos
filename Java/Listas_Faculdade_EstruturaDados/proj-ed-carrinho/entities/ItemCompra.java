package entities;

public class ItemCompra {
    private String descricao;
    private int qtde;
    private double preco;

    public ItemCompra(String descricao, int qtde, double preco) {
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public String mostraItem() {
        String msg =String.format("Descrição: %s | Preco: %.2f | Quantidade: %d | Subtotal: %.2f.", descricao, preco, qtde, calcSubtotal());
        return msg;
    }

    public double calcSubtotal() {
        return qtde * preco;
    }
}
