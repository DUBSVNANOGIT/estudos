package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date (DD//MM/YYYY): ");
        String birthDate = sc.nextLine();
        Client client = new Client(name,email,birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next()); // atenção

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #"+ i +" item data: ");
            System.out.print("Product name: ");
            String nameProduct = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            Product p = new Product(nameProduct, price);
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(quantity, price, p);

            order.addItem(orderItem); //atenção
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);


        sc.close();









 }
}
