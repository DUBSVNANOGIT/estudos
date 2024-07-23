package application;

import entities.TaxPayer;
import entities.Individual;
import entities.Company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> pagadores = new ArrayList<>();
        System.out.print("Enter number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or Company (i/c)? ");
            char op = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            Double anualIncome = sc.nextDouble();
            if (op == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                pagadores.add(new Individual(name, anualIncome,healthExpenditures));
            }
            else if (op == 'c'){
                System.out.print("Number of Employees: ");
                int numberOfEmployees = sc.nextInt();
                pagadores.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }
        System.out.print("\n");
        System.out.println("TAXES PAID:");
        Double sum = 0.0;
        for (TaxPayer t : pagadores) {
            System.out.printf("%s: $ %.2f%n", t.getName(), t.tax());
            sum += t.tax();
        }
        System.out.printf("TOTAL TAXES: $ %.2f", sum);
        sc.close();
    }
}
