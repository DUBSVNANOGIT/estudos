package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> produtos = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Common, used or imported (c/u/i) ? ");
            char op = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if( op == 'c') {
                produtos.add(new Product(name, price));
            }
            else if ( op == 'i') {
                System.out.print("Customs Fee: ");
                Double customsFee = sc.nextDouble();
                produtos.add(new ImportedProduct(name, price, customsFee));
            }
            else {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                produtos.add(new UsedProduct(name, price, date));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product p : produtos) {
            System.out.println(p.priceTag());
        }
        sc.close();
    }
}
