package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> funcionarios = new ArrayList<>();
        System.out.print("Enter full file path: ");
        String path = sc.next();
        try (BufferedReader BR = new BufferedReader(new FileReader(path))) {
            String line = BR.readLine();
            while (line != null) {
                String[] campos = line.split(",");
                funcionarios.add(new Employee(campos[0], campos[1], Double.parseDouble(campos[2])));
                line = BR.readLine();
            }
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println("Email of people whose salary is more than: " + String.format(" %.2f", salary));
            Comparator<String> comp = (e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase());
            List<String> emails = funcionarios.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(e -> e.getEmail())
                    .sorted(comp)
                    .collect(Collectors.toList());
            emails.forEach(System.out::println);
            double sum = funcionarios.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x,y) -> x + y);
            System.out.print("Sum of salary of people whose name starts with 'M':" + String.format("%.2f", sum));
        }
        catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        sc.close();
    }
}
