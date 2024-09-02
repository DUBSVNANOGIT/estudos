
public class Inventario {
    private String[] itens = new String {"cachecol", "guarda-chuva", "touca"};

    public Inventario() {}

    public void adicionar (String item) {
        itens.add(item);
    }
}
