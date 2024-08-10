package entities;

public class Product {

    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //Predicate
    //Método estático trabalha com o a classe que for passada como argumento para ele
    public static boolean staticProductPredicate(Product product) {
        return product.getPrice() >= 100;
    }

    //Método não estático é um método da instância, então ele irá trabalhar com o próprio objeto
    public boolean nonStaticProductPredicate() {
        return price >= 100;
    }

    //Consumer
    public static void staticPriceUpdate(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    public void nonStaticPriceUpdate() {
        price *= 1.1;
    }

    //Function
    public static String staticUpperCaseName(Product p) {
        return p.getName().toUpperCase();
    };

    public String nonStaticUpperCaseName() {
        return name.toUpperCase();
    };

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}