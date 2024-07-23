package application;

import model.entities.Account;
import model.exception.DomainException;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.String.format;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account data: \n" );
        System.out.println("Number: ");
        int number = sc.nextInt();
        System.out.println("Holder: ");
        String holder  = sc.next();
        System.out.println("Initial balance: ");
        Double balance = sc.nextDouble();
        System.out.println("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();
        Account acc = new Account(number, holder, balance, withdrawLimit);
        try {
            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();
            acc.withdraw(amount);
            System.out.println("New balance: " + format("%.2f", acc.getBalance()));
        }
        catch (DomainException e) {
            System.out.println( e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
