package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    List<Employee> funcionarios = new ArrayList<>();
    System.out.print("Enter the number of employees: ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
        System.out.println("Employee #" + i + " data:");
        System.out.println("Outsourced (y/n)? ");
        char outsourced = sc.next().charAt(0);
        System.out.print("Name: ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.print("Hours: ");
        int hours = sc.nextInt();
        System.out.print("Value Per Hour: ");
        double valuePerHour = sc.nextDouble();
        if(outsourced == 'y') {
            System.out.print("Additional charge: ");
            double additionalCharge = sc.nextDouble();
            funcionarios.add(new OutsourcedEmployee(name,hours,valuePerHour, additionalCharge));
        }
        else {
            funcionarios.add(new Employee(name, hours, valuePerHour));
        }
    }

        System.out.println("PAYMENTS: ");
        for (Employee e : funcionarios) {
            System.out.println(e.getName() + " - " + String.format("%.2f", e.payment()));
        }
        sc.close();

    }
}
