public class Triangulo {
    private double base;
    private double altura;

    public Triangulo() {}
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void area() {
        area = (base * altura) / 2;
        System.out.println("Área: " + area);
    }
}