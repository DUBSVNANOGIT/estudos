package entities;

public class Circle extends Shape {
    private Double radius;

    public Circle() {}
    public Circle(Double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public Double area() {
        double pi = 3.14159;
        return pi * Math.pow(radius, 2);

    }
}
