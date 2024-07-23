package application;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

import java.util.List;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> formas = new ArrayList<>();
        System.out.println("Enter the number o shapes: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char op = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (op == 'c') {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                formas.add(new Circle(radius, color));
            }
            else {
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                formas.add(new Rectangle(width, height, color));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape f : formas) {
            System.out.println(String.format("%.2f", f.area()));
        }
        sc.close();
    }
}
