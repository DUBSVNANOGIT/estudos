package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.String.format;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");
        int numero = sc.nextInt();
        LocalDate data = LocalDate.parse(sc.next(), dtf);
        Double valorContrato = sc.nextDouble();
        int month = sc.nextInt();

        Contract contract = new Contract(numero, data, valorContrato);
        ContractService service = new ContractService(contract, new PaypalService());

        service.processContract(contract,month);

        for (Installment p : contract.getInstallments()) {
            System.out.println(p.getDueDate() + " " + p.getAmount());
        }

        sc.close();
    }
}
