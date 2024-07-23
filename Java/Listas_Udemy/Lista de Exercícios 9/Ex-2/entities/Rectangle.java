package entities;

public class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Rectangle() {};
    public Rectangle(Double width, Double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double area() {
        return width * height;
    }
}
